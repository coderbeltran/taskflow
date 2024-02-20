package pe.edu.todotic.taskflow;

import org.springframework.web.bind.annotation.*;

@RestController
public class HolaController {

    @GetMapping("/saludar")
    String saludar(@RequestParam (required = false, defaultValue = "mundo")  String nombre){
    return "Hola  "+ nombre+" !";
    }

    @GetMapping("/despedida")
    String despedida(@RequestParam(required = false) String nombre, @RequestParam(required = false) String apellido){

        if(nombre!=null && apellido==null){
            return "Hola "+ nombre+"!";
        } else if (apellido!=null && nombre==null){
            return "Hola "+ apellido+"!";
        } else if (nombre != null) {
            return "Hola "+ nombre+" "+apellido+"!";
        }else{
            return "Hola mundo!";
        }

    }
    @PostMapping("/crear")
    Tarea crearTarea(@RequestBody Tarea tarea){

return tarea;
    }

    @PostMapping("/crearuser")
    Usuario crearUsuario(@RequestBody Usuario usuario){

        return usuario;
    }

}
