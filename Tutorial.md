# Explicacion de las funciones Javacript

- viewDetailDatatable
Muestra el detalle de la tabla al ser seleccionado una fila de la cabecera

- panelTogglerHandler
Se expande o se achica la cabecera de acuerdo al boton minimizar o maximizar del panel

- heightAdjustRemove
Se quita la clase que ajusta la cabecera para el detalle

-addEventsDatatable
Se agregar los eventos con el addEventListener para escuchar la seleccion de una fila de cabecera tanto click y keyup

Observacion
La utilización de la funcion setTimeout en algunas funciones es debido que al renderizar algunas partes del html donde existe un evento por ejemplo click o keyup desaparecen, entonces el setTimeout es un retardo estimativo para cuando termine de renderizar entonces vuelve a aplicar los eventos