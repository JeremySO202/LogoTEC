package com.logotec.ir;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SimpleIRTest {
    public static void main(String[] args) throws Exception {
        // Crear programa IR simple manualmente
        IRProgram program = new IRProgram();

        // Variables
        program.add(new IRInstr("STORE", new IRVar("x"), new IRConst(10.0)));
        program.add(new IRInstr("STORE", new IRVar("y"), new IRConst(20.0)));

        // Operación
        program.add(new IRInstr("ADD", new IRVar("suma"), new IRVar("x"), new IRVar("y")));

        // Comandos gráficos
        program.add(new IRInstr("CENTRO"));
        program.add(new IRInstr("BAJALAPIZ"));
        program.add(new IRInstr("AVANZA", new IRConst(100.0)));
        program.add(new IRInstr("GIRADERECHA", new IRConst(90.0)));
        program.add(new IRInstr("AVANZA", new IRConst(100.0)));
        program.add(new IRInstr("SUBELAPIZ"));

        System.out.println("=== IR ===");
        System.out.println(program);

        // Generar LLVM
        IRToLLVMEmitter emitter = new IRToLLVMEmitter();
        Path out = Paths.get("programa.ll");
        emitter.emit(program, out);

        System.out.println("\n✓ Archivo LLVM generado: " + out.toAbsolutePath());
    }
}

