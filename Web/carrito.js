// Array de productos
const productos = {
    producto1: {
        nombre: 'Falutas Mixtas',
        precio: '23600',
        descripcion: 'Flautas de pollo y carne con guacamole, frijol refrito y sour cream.',
        srcImg: 'https://www.goya.com/media/3202/chicken-flautas.jpg?quality=80'
    },
    producto2: {
        nombre: 'Nachos',
        precio: '20300',
        descripcion: 'Totopos de maíz con chile con carne, fríjol refrito, queso, jalapeños, guacamole y sour cream.',
        srcImg: 'https://images-gmi-pmc.edge-generalmills.com/df8fe355-6eca-4e8e-abcb-4a718999be41.jpg'
    },
    producto3: {
        nombre: 'Quesadillas',
        precio: '25000',
        descripcion: 'Quesadilla de tortilla de Harina o Maíz, Queso, Pollo, Chorizo, Carne',
        srcImg: 'https://elcomercio.pe/resizer/OYwfSMJTQpPypohZc2Gm1ZkOdzg=/1200x900/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/N3RLTCLRIZAAXFATN2COWHZIZQ.jpg'
    },
    producto4: {
        nombre: 'Esquites',
        precio: '21700',
        descripcion: 'Mazorca a la parrilla desgranada, con limón, mayonesa de jalapeños y queso rayado.',
        srcImg: 'https://recetinas.com/wp-content/uploads/2019/11/esquites-mexicanos.jpg'
    },
    producto5: {
        nombre: 'Fajitas',
        precio: '27300',
        descripcion: 'Fajitas de carne con vegetales, guacamole, sour cream, queso, fríjol refrito y tortillas.',
        srcImg: 'https://mandolina.co/wp-content/uploads/2020/11/comidas-mexicanas-recetas-fajitas-de-carne-1200x720.jpg'
    },
    producto6: {
        nombre: 'Tacos X5',
        precio: '28200',
        descripcion: 'Tacos de pollo, cerdo o al pastor, con pico de gallo, frijoles refritos, sour cream y aguacate',
        srcImg: 'https://vod-hogarmania.atresmedia.com/cocinatis/images/images01/2019/04/12/5cb075f01f4daa0001932474/1239x697.jpg'
    },
    producto7: {
        nombre: 'Burrito',
        precio: '29000',
        descripcion: 'De carnitas, Ropa vieja o Pollo, con queso, frijol negro, guacamole, pico de gallo y salsa taquera.',
        srcImg: 'https://assets.unileversolutions.com/recipes-v2/218407.jpg'
    },
    producto8: {
        nombre: 'Mole Poblano',
        precio: '30600',
        descripcion: 'Carne en salsa de mole: mezcla de diferentes chiles secos, especias, chocolate y caldo de carne.',
        srcImg: 'https://i1.wp.com/itraalimentos.com/wp-content/uploads/2020/12/AdobeStock_273956677-min-scaled.jpeg?fit=1024%2C683&ssl=1'
    },
    producto9: {
        nombre: 'Agua de Jaiamca',
        precio: '5600',
        descripcion: 'Deliciosa agua de flor de Jaimaca. Pidala con o sin azucar.',
        srcImg: 'https://www.culinaryhill.com/wp-content/uploads/2022/08/Agua-De-Jamaica-Culinary-Hill-LR-04.jpg'
    }, producto10: {
        nombre: 'Agua de Horchata',
        precio: '5600',
        descripcion: 'Deliciosa bebida hecha a partir de una mezcla de arroz blanco, leche, azúcar, vainilla y canela.',
        srcImg: 'https://i.blogs.es/f017a7/como-hacer-agua-de-horchata-arroz-3-/450_1000.jpg'
    },
    producto11: {
        nombre: 'Agua de Tamarindo',
        precio: '5600',
        descripcion: 'Deliciosa y refrescante agua de tamarindo. Pidala con o sin azucar.',
        srcImg: 'https://estaticosgn-cdn.deia.eus/clip/7d4c33c8-2179-468b-aab0-75b9764d84e0_16-9-discover-aspect-ratio_default_0.jpg'
    },
    producto12: {
        nombre: 'Michelada',
        precio: '6600',
        descripcion: 'Cerveza con hielo, sal y limón.',
        srcImg: 'https://recetinas.com/wp-content/uploads/2018/05/michelada-mexicana.jpg'
    }
}
// CAPTURA EL TEMPLATE DE LOS PRODUCTOS
const templateProd = document.getElementById('template-prod').content
const contenedorProd = document.querySelector('.contenedor-productos')
const fragment = document.createDocumentFragment()


// AGREGAR LOS PRODUCTOS AL DOM
Object.values(productos).forEach(producto => {
    templateProd.querySelector('.div-info .nombre-prod').textContent = producto.nombre
    templateProd.querySelector('.div-precio-boton .precio').textContent = producto.precio
    templateProd.querySelector('.div-info .descripcion-prod').textContent = producto.descripcion
    templateProd.querySelector('.contenedor-img img').setAttribute('alt', producto.nombre)
    templateProd.querySelector('.contenedor-img img').setAttribute('src', producto.srcImg)
    const clone = templateProd.cloneNode(true)
    fragment.appendChild(clone)
})
contenedorProd.appendChild(fragment)

const comprarButton = document.getElementById("boton_compra");

// Agrega un evento de clic al botón
comprarButton.addEventListener("click", function () {
    // Verifica si hay productos en el carrito antes de redirigir
    const carritoBody = document.getElementById("carrito-body");
    if (carritoBody.children.length > 0) {
        // Si hay productos en el carrito, redirige a la página 
        window.location.href = "usuario.html"; // Reemplaza con la URL 
    } else {
        // Si no hay productos en el carrito, muestra un mensaje de alerta
        alert("Tu carrito está vacío. Agrega productos antes de comprar.");
    }
});

// CARRITO DE COMPRA
let carrito = {}
const templateTabla = document.getElementById('agregar-producto-al-carro').content
const tbodyCarrito = document.getElementById('carrito-body')
const fragmentTabla = document.createDocumentFragment()
const templateFoot = document.getElementById('tfooter').content
const tfootCarrito = document.getElementById('footer')

contenedorProd.addEventListener('click', e => {

    if (e.target.textContent === "Agregar") {
        setCarrito(e.target.parentElement.parentElement)
    }
    e.stopPropagation();
})
const setCarrito = e => {
    const pivoteCarrito = {
        nombre: e.querySelector('.div-info .nombre-prod').textContent,
        precio: e.querySelector('.div-precio-boton .precio').textContent,
        cantidad: 1
    }
    if (carrito.hasOwnProperty(pivoteCarrito.nombre)) {
        carrito[pivoteCarrito.nombre].cantidad += 1
    } else {
        carrito[pivoteCarrito.nombre] = { ...pivoteCarrito }
    }
    pintarTabla(carrito)
}

const pintarTabla = objetoCarrito => {
    Object.values(objetoCarrito).forEach(objeto => {
        const cloneTabla = templateTabla.cloneNode(true)
        cloneTabla.getElementById('producto').textContent = objeto.nombre
        cloneTabla.getElementById('cant').textContent = objeto.cantidad
        cloneTabla.getElementById('precio-uni').textContent = objeto.precio
        let precioTotal = objeto.precio * objeto.cantidad
        cloneTabla.getElementById('precio-total-prod').textContent = precioTotal.toFixed(2)
        fragmentTabla.appendChild(cloneTabla)
    })
    tbodyCarrito.innerHTML = ''
    tbodyCarrito.appendChild(fragmentTabla)
    pintarFooter()
}
const pintarFooter = () => {
    tfootCarrito.innerHTML = ''
    if (Object.keys(carrito).length === 0) {
        tfootCarrito.innerHTML = '<tr><td colspan = 4>¡No hay ningun elemento en el carrito!</td></tr>'
    } else {
        const total = Object.values(carrito).reduce((acc, { cantidad, precio }) => acc + (cantidad * precio), 0)
        templateFoot.getElementById('total-a-pagar').textContent = total.toFixed(2)
        const cloneFoot = templateFoot.cloneNode(true)
        fragment.appendChild(cloneFoot)
        tfootCarrito.appendChild(fragment)
        //Boton Vaciar carrito
        const botonVaciar = document.getElementById('vaciar-tabla')
        botonVaciar.addEventListener('click', () => {
            carrito = {}
            pintarTabla(carrito)
            window.location.href = "usuario.html"; // Reemplaza con la URL 
            pintarFooter()
        })
        //Boton Comprar carrito
        const botonComprar = document.getElementById('comprar')
        botonVaciar.addEventListener('click', () => {
            carrito = {}
            window.location.href = '';
            pintarTabla(carrito)
            pintarFooter()
        })

        //BOTONES CANTIDADES DEL CARRITO

    }
}
tbodyCarrito.addEventListener('click', e => {

    if (e.target.classList.contains('button')) {
        aumentarDisminuir(e.target)
    }
})
const aumentarDisminuir = boton => {
    if (boton.textContent === '+') {
        const indicador = boton.parentElement.parentElement.firstElementChild.textContent
        Object.values(carrito).forEach(elemento => {
            if (elemento.nombre === indicador) {
                carrito[elemento.nombre].cantidad++
            }
        })
    }
    if (boton.textContent === '-') {
        const indicador = boton.parentElement.parentElement.firstElementChild.textContent
        Object.values(carrito).forEach(elemento => {
            if (elemento.nombre === indicador) {
                carrito[elemento.nombre].cantidad--
                if (carrito[elemento.nombre].cantidad === 0) {
                    delete carrito[elemento.nombre]
                }
            }
        })
    }
    pintarTabla(carrito)
    pintarFooter()
}