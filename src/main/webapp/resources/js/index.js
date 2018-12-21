

var datatableBody = document.querySelector('.ui-datatable-scrollable-body');
var dtPaisesRowSelected = document.querySelector("div.ui-datatable-scrollable-body");
var dtRowSelected;
var panelIconToggler;

//Muestra el detalle
function mostrarDetalle() {

    if (datatableBody.className.search('rowSelected') > -1) {
        rowSelectedRemove();
    }

    //Agrega clase para achica la cabecera
    datatableBody.className += ' rowSelected';
    
    //El panel se renderiza, se vuelve a indicar el evento click para el toggler
    setTimeout(function() {
        dtRowSelected = document.querySelector('tr.ui-datatable-selectable[aria-selected="true"]');           
        datatableBody.scrollTo(0, dtRowSelected.dataset.ri * 24); //Realizar scorll a la fila seleccionada
        panelIconToggler = document.querySelector('.ui-panel a[id$="toggler"]');
        panelIconToggler.addEventListener('click', panelTogglerHandler, true);
    }, 500);

}

//Achica o agranda la cabecera de acerudo al boton de minimizar
function panelTogglerHandler() {
    console.log(datatableBody.className);
    if (datatableBody.className.search('rowSelected') > -1) {
        rowSelectedRemove();
    } else {
        datatableBody.className += ' rowSelected';
    }
}

//Se quita la clase rowSelected
function rowSelectedRemove() {
    datatableBody.className = datatableBody.className.replace(/\browSelected\b/g, "");
    datatableBody.className = datatableBody.className.trim();
}

dtPaisesRowSelected.addEventListener('click', mostrarDetalle, true);
dtPaisesRowSelected.addEventListener('keyup', mostrarDetalle, true);









