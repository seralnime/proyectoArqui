/**
    Santiago Sánchez Cárdenas
    Sergio Gabriel Nieto Meneses
    Mauricio Andres Valderrama Acosta
**/

CREATE TABLE IF NOT EXISTS T_CLIENTES (
    ID INT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    Licencia VARCHAR(255),
    Direccion VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS T_PRODUCTOS (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(255) NOT NULL,
    Descripcion TEXT,
    Cantidad INT,
    Precio FLOAT,
    Ingredientes TEXT,
    TieneDescuento BOOLEAN
);

CREATE TABLE IF NOT EXISTS T_PEDIDOS (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    ClienteID INT,
    total FLOAT,
    PagoHecho BOOLEAN,
    tarifaDomicilio FLOAT,
    FOREIGN KEY (ClienteID) REFERENCES T_CLIENTES(ID)
);

CREATE TABLE IF NOT EXISTS T_PEDIDO_PRODUCTO (
    PedidoID INT,
    ProductoID INT,
    Cantidad INT,
    PRIMARY KEY (PedidoID, ProductoID),
    FOREIGN KEY (PedidoID) REFERENCES T_PEDIDOS(ID),
    FOREIGN KEY (ProductoID) REFERENCES T_PRODUCTOS(Id)
);

INSERT INTO T_CLIENTES (ID, nombre, Licencia, Direccion) VALUES
(1, 'Cliente 1', 'Licencia 1', 'Dirección 1'),
(2, 'Cliente 2', 'Licencia 2', 'Dirección 2'),
(3, 'Cliente 3', 'Licencia 3', 'Dirección 3');


INSERT INTO T_PRODUCTOS (Nombre, Descripcion, Cantidad, Precio, Ingredientes, TieneDescuento) VALUES
('Enchiladas', 'Tortillas de maíz con pollo bañadas en salsa roja y queso', 20, 25000.00, 'Tortillas de maíz, Pollo, Salsa roja, Queso', false),
('Tacos al Pastor', 'Tortillas de maíz con carne al pastor, cebolla y cilantro', 30, 17000.00, 'Tortillas de maíz, Carne al pastor, Cebolla, Cilantro', true),
('Guacamole', 'Puré de aguacate con tomate, cebolla y limón', 15, 6000.00, 'Aguacate, Tomate, Cebolla, Limón', false),
('Tamales', 'Masa de maíz rellena de pollo con salsa verde', 25, 10000.00, 'Masa de maíz, Pollo, Salsa verde', true),
('Chiles Rellenos', 'Chiles poblanos rellenos de queso y bañados en salsa roja', 20, 13000.00, 'Chiles poblanos, Queso, Salsa roja', false);


INSERT INTO T_PEDIDOS (ClienteID, total, PagoHecho, tarifaDomicilio) VALUES
(1, 500.00, true, 50.00),
(2, 750.00, false, 75.00),
(3, 1000.00, true, 100.00);


INSERT INTO T_PEDIDO_PRODUCTO (PedidoID, ProductoID, Cantidad) VALUES
(1, 1, 2),
(1, 2, 3),
(1, 3, 1),
(2, 1, 2),
(2, 4, 4),
(2, 5, 1),
(3, 3, 2),
(3, 4, 3),
(3, 5, 2);

