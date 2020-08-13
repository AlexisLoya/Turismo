function  guardar() {
    var formulario = $("#fcp").serializeArray();
    let obj = convert(formulario);
    var data = JSON.parse(String(obj+""));
    const url = "http://localhost:8080/Cocina/crearPlatillo";
    $.ajax({
        type:'post',
        url:url,
        data:{
            accion:'crear',
            data:JSON.stringify(data)
        }
    }).done(function (data) {
        swal('Exito! :D', 'Platillo registrado', 'success');
        document.getElementById("fcp").reset();
        }).fail(function (xhr, status, error) {
        swal('Error! :(', 'Inténtelo nuevamente', 'warning');
    });
}

function convert(formulario) {
    var obj = "{";
    $.each(formulario, function (i,field) {
        obj = obj +"\""+field.name+"\""+":\""+field.value+"\",";
    });
    obj = obj.substring(0,obj.length-1);
    obj = obj+"}";
    return obj;
}