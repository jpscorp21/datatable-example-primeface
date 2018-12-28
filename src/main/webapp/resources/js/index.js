

var dtCabeceraRow = document.querySelector(".dtCabecera .ui-datatable-scrollable-body");
var dtCabeceraRowSelected;
var panelIconToggler;

//Muestra el detalle
function viewDetailDatatable() {

    if (dtCabeceraRow.className.search('heightAdjust') > -1) {
        heightAdjustRemove();
    }

    //Agrega clase para achica la cabecera
    dtCabeceraRow.className += ' heightAdjust';
    
    //El panel se renderiza, se vuelve a indicar el evento click para el toggler
    setTimeout(function() {
        var dtRowSelected = document.querySelector('tr.ui-datatable-selectable[aria-selected="true"]');           
        dtCabeceraRow.scrollTo(0, dtRowSelected.dataset.ri * 24); //Realizar scorll a la fila seleccionada
        panelIconToggler = document.querySelector('.ui-panel a[id$="toggler"]');
        panelIconToggler.addEventListener('click', panelTogglerHandler, true);
    }, 500);

}

//Achica o agranda la cabecera de acerudo al boton de minimizar
function panelTogglerHandler() {    
    if (dtCabeceraRow.className.search('heightAdjust') > -1) {
        heightAdjustRemove();
    } else {
        dtCabeceraRow.className += ' heightAdjust';
    }
}

//Se quita la clase rowSelected
function heightAdjustRemove() {
    dtCabeceraRow.className = dtCabeceraRow.className.replace(/\bheightAdjust\b/g, "");
    dtCabeceraRow.className = dtCabeceraRow.className.trim();
}

function addEventsDatatable() {
    setTimeout(function() {
       dtCabeceraRow.addEventListener('click', viewDetailDatatable, true);
        dtCabeceraRow.addEventListener('keyup', viewDetailDatatable, true); 
    }, 500);     
}

addEventsDatatable();










