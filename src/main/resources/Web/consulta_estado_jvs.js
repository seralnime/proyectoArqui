
async function consultarEstado() {
    const cedulaInput = document.querySelector('.input-text').value;
    const cedulaContainer = document.getElementById('cedula-container');
    const estadoContainer = document.getElementById('estado-container');

    try {
        const response = await fetch(`http://127.0.0.1:8000/api/orders/${cedulaInput}`); // Reemplaza 'URL_DE_TU_API_AQUI' con la URL real de tu API

        if (!response.ok) {
            throw new Error('No se pudo obtener la información');
        }

        const data = await response.json();
        cedulaContainer.innerHTML = `<p>${cedulaInput}</p>`;
        estadoContainer.innerHTML = `<p>${data.estado}</p>`; // Asumiendo que 'data.estado' es la propiedad que contiene el estado devuelto por tu API
    } catch (error) {
        console.error('Error:', error);
        cedulaContainer.innerHTML = '';
        estadoContainer.innerHTML = '';
    }
}
