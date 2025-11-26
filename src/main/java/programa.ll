; Runtime Logo functions
declare void @logo_init_runtime(i32, i8**)
declare void @logo_reset()
declare void @logo_avanza(double)
declare void @logo_retrocede(double)
declare void @logo_giraderecha(double)
declare void @logo_giraizquierda(double)
declare void @logo_centro()
declare void @logo_ponpos(double, double)
declare void @logo_ponxy(double, double)
declare void @logo_ponx(double)
declare void @logo_pony(double)
declare void @logo_ponrumbo(double)
declare void @logo_bajalapiz()
declare void @logo_subelapiz()
declare void @logo_poncolor(i32)
declare void @logo_ocultatortuga()
declare void @logo_espera(double)
declare void @logo_show()

@var_AZUL = global double 0.0
@var_NEGRO = global double 0.0
@var_ROJO = global double 0.0
@var_angulo_petalo = global double 0.0
@var_dist_cuadrados = global double 0.0
@var_hex_capas = global double 0.0
@var_hex_tam = global double 0.0
@var_i = global double 0.0
@var_iteraciones_espiral = global double 0.0
@var_lado_aproximado = global double 0.0
@var_lados_poligono = global double 0.0
@var_num_cuadrados = global double 0.0
@var_onda_tam = global double 0.0
@var_ondas = global double 0.0
@var_petalos = global double 0.0
@var_radio = global double 0.0
@var_radio_circulo = global double 0.0
@var_radio_rayo = global double 0.0
@var_rosa_tam = global double 0.0
@var_t1 = global double 0.0
@var_t10 = global double 0.0
@var_t11 = global double 0.0
@var_t12 = global double 0.0
@var_t13 = global double 0.0
@var_t14 = global double 0.0
@var_t15 = global double 0.0
@var_t16 = global double 0.0
@var_t17 = global double 0.0
@var_t18 = global double 0.0
@var_t19 = global double 0.0
@var_t2 = global double 0.0
@var_t20 = global double 0.0
@var_t21 = global double 0.0
@var_t22 = global double 0.0
@var_t23 = global double 0.0
@var_t24 = global double 0.0
@var_t25 = global double 0.0
@var_t26 = global double 0.0
@var_t27 = global double 0.0
@var_t28 = global double 0.0
@var_t29 = global double 0.0
@var_t3 = global double 0.0
@var_t30 = global double 0.0
@var_t31 = global double 0.0
@var_t32 = global double 0.0
@var_t33 = global double 0.0
@var_t34 = global double 0.0
@var_t35 = global double 0.0
@var_t36 = global double 0.0
@var_t37 = global double 0.0
@var_t38 = global double 0.0
@var_t39 = global double 0.0
@var_t4 = global double 0.0
@var_t40 = global double 0.0
@var_t41 = global double 0.0
@var_t42 = global double 0.0
@var_t43 = global double 0.0
@var_t44 = global double 0.0
@var_t45 = global double 0.0
@var_t46 = global double 0.0
@var_t47 = global double 0.0
@var_t48 = global double 0.0
@var_t49 = global double 0.0
@var_t5 = global double 0.0
@var_t50 = global double 0.0
@var_t51 = global double 0.0
@var_t52 = global double 0.0
@var_t53 = global double 0.0
@var_t54 = global double 0.0
@var_t55 = global double 0.0
@var_t56 = global double 0.0
@var_t57 = global double 0.0
@var_t58 = global double 0.0
@var_t59 = global double 0.0
@var_t6 = global double 0.0
@var_t60 = global double 0.0
@var_t61 = global double 0.0
@var_t62 = global double 0.0
@var_t63 = global double 0.0
@var_t64 = global double 0.0
@var_t65 = global double 0.0
@var_t7 = global double 0.0
@var_t8 = global double 0.0
@var_t9 = global double 0.0
@var_tam_espiral = global double 0.0
@var_tam_estrella = global double 0.0
@var_trian_tam = global double 0.0
@var_zig_count = global double 0.0
@var_zig_tam = global double 0.0

define i32 @main(i32 %argc, i8** %argv) {
entry:
  call void @logo_init_runtime(i32 %argc, i8** %argv)
  call void @logo_reset()
  br label %_block_

_block_:
  call void @logo_centro()
  call void @logo_ponrumbo(double 0.0)
  %t0 = load double, double* @var_AZUL
  %t1 = fptoui double %t0 to i32
  call void @logo_poncolor(i32 %t1)
  store double 60.0, double* @var_radio
  store double 12.0, double* @var_petalos
  store double 0.0, double* @var_angulo_petalo
  %t2 = load double, double* @var_petalos
  %t3 = fdiv double 360.0, %t2
  store double %t3, double* @var_t1
  %t4 = load double, double* @var_t1
  store double %t4, double* @var_angulo_petalo
  %t5 = load double, double* @var_petalos
  store double %t5, double* @var_t2
  br label %L1

L1:
  call void @logo_bajalapiz()
  store double 2.0, double* @var_t3
  br label %L3

L3:
  %t6 = load double, double* @var_radio
  call void @logo_avanza(double %t6)
  call void @logo_giraderecha(double 60.0)
  %t7 = load double, double* @var_radio
  call void @logo_avanza(double %t7)
  call void @logo_giraderecha(double 120.0)
  %t8 = load double, double* @var_t3
  %t9 = fsub double %t8, 1.0
  store double %t9, double* @var_t4
  %t10 = load double, double* @var_t4
  store double %t10, double* @var_t3
  %t11 = load double, double* @var_t3
  %t12 = fcmp ogt double %t11, 0.0
  %t13 = uitofp i1 %t12 to double
  store double %t13, double* @var_t5
  %t14 = load double, double* @var_t5
  %t15 = fcmp one double %t14, 0.0
  br i1 %t15, label %L3, label %cjmp_false_0

cjmp_false_0:
  br label %L4

L4:
  call void @logo_subelapiz()
  call void @logo_centro()
  %t16 = load double, double* @var_angulo_petalo
  call void @logo_giraderecha(double %t16)
  %t17 = load double, double* @var_t2
  %t18 = fsub double %t17, 1.0
  store double %t18, double* @var_t6
  %t19 = load double, double* @var_t6
  store double %t19, double* @var_t2
  %t20 = load double, double* @var_t2
  %t21 = fcmp ogt double %t20, 0.0
  %t22 = uitofp i1 %t21 to double
  store double %t22, double* @var_t7
  %t23 = load double, double* @var_t7
  %t24 = fcmp one double %t23, 0.0
  br i1 %t24, label %L1, label %cjmp_false_1

cjmp_false_1:
  br label %L2

L2:
  call void @logo_centro()
  call void @logo_ponrumbo(double 0.0)
  %t25 = load double, double* @var_ROJO
  %t26 = fptoui double %t25 to i32
  call void @logo_poncolor(i32 %t26)
  store double 50.0, double* @var_tam_estrella
  store double 8.0, double* @var_t8
  br label %L5

L5:
  call void @logo_bajalapiz()
  store double 5.0, double* @var_t9
  br label %L7

L7:
  %t27 = load double, double* @var_tam_estrella
  call void @logo_avanza(double %t27)
  call void @logo_giraderecha(double 144.0)
  %t28 = load double, double* @var_t9
  %t29 = fsub double %t28, 1.0
  store double %t29, double* @var_t10
  %t30 = load double, double* @var_t10
  store double %t30, double* @var_t9
  %t31 = load double, double* @var_t9
  %t32 = fcmp ogt double %t31, 0.0
  %t33 = uitofp i1 %t32 to double
  store double %t33, double* @var_t11
  %t34 = load double, double* @var_t11
  %t35 = fcmp one double %t34, 0.0
  br i1 %t35, label %L7, label %cjmp_false_2

cjmp_false_2:
  br label %L8

L8:
  call void @logo_subelapiz()
  call void @logo_centro()
  call void @logo_giraderecha(double 45.0)
  %t36 = load double, double* @var_t8
  %t37 = fsub double %t36, 1.0
  store double %t37, double* @var_t12
  %t38 = load double, double* @var_t12
  store double %t38, double* @var_t8
  %t39 = load double, double* @var_t8
  %t40 = fcmp ogt double %t39, 0.0
  %t41 = uitofp i1 %t40 to double
  store double %t41, double* @var_t13
  %t42 = load double, double* @var_t13
  %t43 = fcmp one double %t42, 0.0
  br i1 %t43, label %L5, label %cjmp_false_3

cjmp_false_3:
  br label %L6

L6:
  call void @logo_centro()
  call void @logo_ponrumbo(double 0.0)
  %t44 = load double, double* @var_NEGRO
  %t45 = fptoui double %t44 to i32
  call void @logo_poncolor(i32 %t45)
  store double 75.0, double* @var_radio_circulo
  store double 36.0, double* @var_lados_poligono
  store double 0.0, double* @var_lado_aproximado
  %t46 = load double, double* @var_radio_circulo
  %t47 = fmul double %t46, 6.0
  store double %t47, double* @var_t14
  %t48 = load double, double* @var_t14
  %t49 = load double, double* @var_lados_poligono
  %t50 = fdiv double %t48, %t49
  store double %t50, double* @var_t15
  %t51 = load double, double* @var_t15
  store double %t51, double* @var_lado_aproximado
  call void @logo_bajalapiz()
  %t52 = load double, double* @var_lados_poligono
  store double %t52, double* @var_t16
  br label %L9

L9:
  %t53 = load double, double* @var_lado_aproximado
  call void @logo_avanza(double %t53)
  %t54 = load double, double* @var_lados_poligono
  %t55 = fdiv double 360.0, %t54
  store double %t55, double* @var_t17
  %t56 = load double, double* @var_t17
  call void @logo_giraderecha(double %t56)
  %t57 = load double, double* @var_t16
  %t58 = fsub double %t57, 1.0
  store double %t58, double* @var_t18
  %t59 = load double, double* @var_t18
  store double %t59, double* @var_t16
  %t60 = load double, double* @var_t16
  %t61 = fcmp ogt double %t60, 0.0
  %t62 = uitofp i1 %t61 to double
  store double %t62, double* @var_t19
  %t63 = load double, double* @var_t19
  %t64 = fcmp one double %t63, 0.0
  br i1 %t64, label %L9, label %cjmp_false_4

cjmp_false_4:
  br label %L10

L10:
  call void @logo_subelapiz()
  call void @logo_centro()
  call void @logo_ponrumbo(double 0.0)
  %t65 = load double, double* @var_AZUL
  %t66 = fptoui double %t65 to i32
  call void @logo_poncolor(i32 %t66)
  store double 3.0, double* @var_tam_espiral
  store double 0.0, double* @var_iteraciones_espiral
  call void @logo_bajalapiz()
  store double 50.0, double* @var_t20
  br label %L11

L11:
  %t67 = load double, double* @var_tam_espiral
  call void @logo_avanza(double %t67)
  call void @logo_giraderecha(double 89.0)
  %t68 = load double, double* @var_tam_espiral
  %t69 = fadd double %t68, 1.5
  store double %t69, double* @var_t21
  %t70 = load double, double* @var_t21
  store double %t70, double* @var_tam_espiral
  %t71 = load double, double* @var_t20
  %t72 = fsub double %t71, 1.0
  store double %t72, double* @var_t22
  %t73 = load double, double* @var_t22
  store double %t73, double* @var_t20
  %t74 = load double, double* @var_t20
  %t75 = fcmp ogt double %t74, 0.0
  %t76 = uitofp i1 %t75 to double
  store double %t76, double* @var_t23
  %t77 = load double, double* @var_t23
  %t78 = fcmp one double %t77, 0.0
  br i1 %t78, label %L11, label %cjmp_false_5

cjmp_false_5:
  br label %L12

L12:
  call void @logo_subelapiz()
  call void @logo_centro()
  call void @logo_ponrumbo(double 0.0)
  store double 25.0, double* @var_dist_cuadrados
  store double 5.0, double* @var_num_cuadrados
  store double 0.0, double* @var_i
  %t79 = load double, double* @var_num_cuadrados
  store double %t79, double* @var_t24
  br label %L13

L13:
  %t80 = load double, double* @var_ROJO
  %t81 = fptoui double %t80 to i32
  call void @logo_poncolor(i32 %t81)
  %t82 = load double, double* @var_i
  %t83 = fdiv double %t82, 2.0
  store double %t83, double* @var_t25
  %t84 = load double, double* @var_t25
  %t85 = fmul double 2.0, %t84
  store double %t85, double* @var_t26
  %t86 = load double, double* @var_t26
  %t87 = load double, double* @var_i
  %t88 = fcmp oeq double %t86, %t87
  %t89 = uitofp i1 %t88 to double
  store double %t89, double* @var_t27
  %t90 = load double, double* @var_t27
  %t91 = fcmp one double %t90, 0.0
  br i1 %t91, label %L15, label %cjmp_false_6

cjmp_false_6:
  br label %L16

L15:
  %t92 = load double, double* @var_AZUL
  %t93 = fptoui double %t92 to i32
  call void @logo_poncolor(i32 %t93)
  br label %L16

L16:
  call void @logo_bajalapiz()
  store double 4.0, double* @var_t28
  br label %L17

L17:
  %t94 = load double, double* @var_dist_cuadrados
  call void @logo_avanza(double %t94)
  call void @logo_giraderecha(double 90.0)
  %t95 = load double, double* @var_t28
  %t96 = fsub double %t95, 1.0
  store double %t96, double* @var_t29
  %t97 = load double, double* @var_t29
  store double %t97, double* @var_t28
  %t98 = load double, double* @var_t28
  %t99 = fcmp ogt double %t98, 0.0
  %t100 = uitofp i1 %t99 to double
  store double %t100, double* @var_t30
  %t101 = load double, double* @var_t30
  %t102 = fcmp one double %t101, 0.0
  br i1 %t102, label %L17, label %cjmp_false_7

cjmp_false_7:
  br label %L18

L18:
  call void @logo_subelapiz()
  %t103 = load double, double* @var_dist_cuadrados
  %t104 = fadd double %t103, 12.0
  store double %t104, double* @var_t31
  %t105 = load double, double* @var_t31
  store double %t105, double* @var_dist_cuadrados
  %t106 = load double, double* @var_i
  %t107 = fadd double %t106, 1.0
  store double %t107, double* @var_i
  %t108 = load double, double* @var_t24
  %t109 = fsub double %t108, 1.0
  store double %t109, double* @var_t32
  %t110 = load double, double* @var_t32
  store double %t110, double* @var_t24
  %t111 = load double, double* @var_t24
  %t112 = fcmp ogt double %t111, 0.0
  %t113 = uitofp i1 %t112 to double
  store double %t113, double* @var_t33
  %t114 = load double, double* @var_t33
  %t115 = fcmp one double %t114, 0.0
  br i1 %t115, label %L13, label %cjmp_false_8

cjmp_false_8:
  br label %L14

L14:
  call void @logo_centro()
  call void @logo_ponxy(double 120.0, double 90.0)
  %t116 = load double, double* @var_NEGRO
  %t117 = fptoui double %t116 to i32
  call void @logo_poncolor(i32 %t117)
  store double 20.0, double* @var_zig_tam
  store double 0.0, double* @var_zig_count
  call void @logo_bajalapiz()
  store double 6.0, double* @var_t34
  br label %L19

L19:
  %t118 = load double, double* @var_zig_tam
  call void @logo_avanza(double %t118)
  call void @logo_giraderecha(double 90.0)
  %t119 = load double, double* @var_zig_tam
  call void @logo_avanza(double %t119)
  call void @logo_giraizquierda(double 90.0)
  %t120 = load double, double* @var_t34
  %t121 = fsub double %t120, 1.0
  store double %t121, double* @var_t35
  %t122 = load double, double* @var_t35
  store double %t122, double* @var_t34
  %t123 = load double, double* @var_t34
  %t124 = fcmp ogt double %t123, 0.0
  %t125 = uitofp i1 %t124 to double
  store double %t125, double* @var_t36
  %t126 = load double, double* @var_t36
  %t127 = fcmp one double %t126, 0.0
  br i1 %t127, label %L19, label %cjmp_false_9

cjmp_false_9:
  br label %L20

L20:
  call void @logo_subelapiz()
  call void @logo_centro()
  call void @logo_ponxy(double -120.0, double 90.0)
  call void @logo_ponrumbo(double 0.0)
  %t128 = load double, double* @var_ROJO
  %t129 = fptoui double %t128 to i32
  call void @logo_poncolor(i32 %t129)
  store double 40.0, double* @var_rosa_tam
  call void @logo_bajalapiz()
  store double 18.0, double* @var_t37
  br label %L21

L21:
  store double 2.0, double* @var_t38
  br label %L23

L23:
  %t130 = load double, double* @var_rosa_tam
  call void @logo_avanza(double %t130)
  call void @logo_giraderecha(double 45.0)
  %t131 = load double, double* @var_rosa_tam
  call void @logo_avanza(double %t131)
  call void @logo_giraderecha(double 135.0)
  %t132 = load double, double* @var_t38
  %t133 = fsub double %t132, 1.0
  store double %t133, double* @var_t39
  %t134 = load double, double* @var_t39
  store double %t134, double* @var_t38
  %t135 = load double, double* @var_t38
  %t136 = fcmp ogt double %t135, 0.0
  %t137 = uitofp i1 %t136 to double
  store double %t137, double* @var_t40
  %t138 = load double, double* @var_t40
  %t139 = fcmp one double %t138, 0.0
  br i1 %t139, label %L23, label %cjmp_false_10

cjmp_false_10:
  br label %L24

L24:
  call void @logo_giraderecha(double 20.0)
  %t140 = load double, double* @var_t37
  %t141 = fsub double %t140, 1.0
  store double %t141, double* @var_t41
  %t142 = load double, double* @var_t41
  store double %t142, double* @var_t37
  %t143 = load double, double* @var_t37
  %t144 = fcmp ogt double %t143, 0.0
  %t145 = uitofp i1 %t144 to double
  store double %t145, double* @var_t42
  %t146 = load double, double* @var_t42
  %t147 = fcmp one double %t146, 0.0
  br i1 %t147, label %L21, label %cjmp_false_11

cjmp_false_11:
  br label %L22

L22:
  call void @logo_subelapiz()
  call void @logo_centro()
  call void @logo_ponxy(double 120.0, double -90.0)
  %t148 = load double, double* @var_AZUL
  %t149 = fptoui double %t148 to i32
  call void @logo_poncolor(i32 %t149)
  store double 15.0, double* @var_hex_tam
  store double 0.0, double* @var_hex_capas
  store double 4.0, double* @var_t43
  br label %L25

L25:
  call void @logo_bajalapiz()
  store double 6.0, double* @var_t44
  br label %L27

L27:
  %t150 = load double, double* @var_hex_tam
  call void @logo_avanza(double %t150)
  call void @logo_giraderecha(double 60.0)
  %t151 = load double, double* @var_t44
  %t152 = fsub double %t151, 1.0
  store double %t152, double* @var_t45
  %t153 = load double, double* @var_t45
  store double %t153, double* @var_t44
  %t154 = load double, double* @var_t44
  %t155 = fcmp ogt double %t154, 0.0
  %t156 = uitofp i1 %t155 to double
  store double %t156, double* @var_t46
  %t157 = load double, double* @var_t46
  %t158 = fcmp one double %t157, 0.0
  br i1 %t158, label %L27, label %cjmp_false_12

cjmp_false_12:
  br label %L28

L28:
  call void @logo_subelapiz()
  %t159 = load double, double* @var_hex_tam
  %t160 = fadd double %t159, 10.0
  store double %t160, double* @var_t47
  %t161 = load double, double* @var_t47
  store double %t161, double* @var_hex_tam
  call void @logo_giraderecha(double 30.0)
  %t162 = load double, double* @var_t43
  %t163 = fsub double %t162, 1.0
  store double %t163, double* @var_t48
  %t164 = load double, double* @var_t48
  store double %t164, double* @var_t43
  %t165 = load double, double* @var_t43
  %t166 = fcmp ogt double %t165, 0.0
  %t167 = uitofp i1 %t166 to double
  store double %t167, double* @var_t49
  %t168 = load double, double* @var_t49
  %t169 = fcmp one double %t168, 0.0
  br i1 %t169, label %L25, label %cjmp_false_13

cjmp_false_13:
  br label %L26

L26:
  call void @logo_centro()
  call void @logo_ponxy(double -120.0, double -90.0)
  %t170 = load double, double* @var_NEGRO
  %t171 = fptoui double %t170 to i32
  call void @logo_poncolor(i32 %t171)
  store double 50.0, double* @var_trian_tam
  call void @logo_bajalapiz()
  store double 3.0, double* @var_t50
  br label %L29

L29:
  %t172 = load double, double* @var_trian_tam
  call void @logo_avanza(double %t172)
  call void @logo_giraderecha(double 120.0)
  %t173 = load double, double* @var_t50
  %t174 = fsub double %t173, 1.0
  store double %t174, double* @var_t51
  %t175 = load double, double* @var_t51
  store double %t175, double* @var_t50
  %t176 = load double, double* @var_t50
  %t177 = fcmp ogt double %t176, 0.0
  %t178 = uitofp i1 %t177 to double
  store double %t178, double* @var_t52
  %t179 = load double, double* @var_t52
  %t180 = fcmp one double %t179, 0.0
  br i1 %t180, label %L29, label %cjmp_false_14

cjmp_false_14:
  br label %L30

L30:
  call void @logo_subelapiz()
  %t181 = load double, double* @var_trian_tam
  %t182 = fdiv double %t181, 2.0
  store double %t182, double* @var_t53
  %t183 = load double, double* @var_t53
  call void @logo_avanza(double %t183)
  call void @logo_giraderecha(double 90.0)
  %t184 = load double, double* @var_trian_tam
  %t185 = fdiv double %t184, 4.0
  store double %t185, double* @var_t54
  %t186 = load double, double* @var_t54
  call void @logo_avanza(double %t186)
  call void @logo_giraizquierda(double 90.0)
  call void @logo_bajalapiz()
  store double 3.0, double* @var_t55
  br label %L31

L31:
  %t187 = load double, double* @var_trian_tam
  %t188 = fdiv double %t187, 2.0
  store double %t188, double* @var_t56
  %t189 = load double, double* @var_t56
  call void @logo_avanza(double %t189)
  call void @logo_giraderecha(double 120.0)
  %t190 = load double, double* @var_t55
  %t191 = fsub double %t190, 1.0
  store double %t191, double* @var_t57
  %t192 = load double, double* @var_t57
  store double %t192, double* @var_t55
  %t193 = load double, double* @var_t55
  %t194 = fcmp ogt double %t193, 0.0
  %t195 = uitofp i1 %t194 to double
  store double %t195, double* @var_t58
  %t196 = load double, double* @var_t58
  %t197 = fcmp one double %t196, 0.0
  br i1 %t197, label %L31, label %cjmp_false_15

cjmp_false_15:
  br label %L32

L32:
  call void @logo_subelapiz()
  call void @logo_centro()
  call void @logo_ponrumbo(double 0.0)
  %t198 = load double, double* @var_ROJO
  %t199 = fptoui double %t198 to i32
  call void @logo_poncolor(i32 %t199)
  store double 90.0, double* @var_radio_rayo
  call void @logo_bajalapiz()
  store double 16.0, double* @var_t59
  br label %L33

L33:
  %t200 = load double, double* @var_radio_rayo
  call void @logo_avanza(double %t200)
  %t201 = load double, double* @var_radio_rayo
  call void @logo_retrocede(double %t201)
  %t202 = fdiv double 360.0, 16.0
  store double %t202, double* @var_t60
  %t203 = load double, double* @var_t60
  call void @logo_giraderecha(double %t203)
  %t204 = load double, double* @var_t59
  %t205 = fsub double %t204, 1.0
  store double %t205, double* @var_t61
  %t206 = load double, double* @var_t61
  store double %t206, double* @var_t59
  %t207 = load double, double* @var_t59
  %t208 = fcmp ogt double %t207, 0.0
  %t209 = uitofp i1 %t208 to double
  store double %t209, double* @var_t62
  %t210 = load double, double* @var_t62
  %t211 = fcmp one double %t210, 0.0
  br i1 %t211, label %L33, label %cjmp_false_16

cjmp_false_16:
  br label %L34

L34:
  call void @logo_subelapiz()
  call void @logo_centro()
  call void @logo_ponrumbo(double 45.0)
  %t212 = load double, double* @var_AZUL
  %t213 = fptoui double %t212 to i32
  call void @logo_poncolor(i32 %t213)
  store double 0.0, double* @var_ondas
  store double 15.0, double* @var_onda_tam
  call void @logo_bajalapiz()
  store double 15.0, double* @var_t63
  br label %L35

L35:
  %t214 = load double, double* @var_onda_tam
  call void @logo_avanza(double %t214)
  call void @logo_giraderecha(double 30.0)
  %t215 = load double, double* @var_onda_tam
  call void @logo_avanza(double %t215)
  call void @logo_giraizquierda(double 60.0)
  %t216 = load double, double* @var_onda_tam
  call void @logo_avanza(double %t216)
  call void @logo_giraderecha(double 30.0)
  %t217 = load double, double* @var_t63
  %t218 = fsub double %t217, 1.0
  store double %t218, double* @var_t64
  %t219 = load double, double* @var_t64
  store double %t219, double* @var_t63
  %t220 = load double, double* @var_t63
  %t221 = fcmp ogt double %t220, 0.0
  %t222 = uitofp i1 %t221 to double
  store double %t222, double* @var_t65
  %t223 = load double, double* @var_t65
  %t224 = fcmp one double %t223, 0.0
  br i1 %t224, label %L35, label %cjmp_false_17

cjmp_false_17:
  br label %L36

L36:
  call void @logo_subelapiz()
  call void @logo_centro()
  call void @logo_subelapiz()
  call void @logo_espera(double 2000.0)
  call void @logo_ocultatortuga()
  ret i32 0
}
