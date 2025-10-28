; Runtime Logo functions
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

@var_ROJO = global double 0.0
@var_mitad = global double 0.0
@var_rotacion = global double 0.0
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
@var_t4 = global double 0.0
@var_t5 = global double 0.0
@var_t6 = global double 0.0
@var_t7 = global double 0.0
@var_t8 = global double 0.0
@var_t9 = global double 0.0
@var_tam = global double 0.0

define i32 @main() {
entry:
  call void @logo_reset()
  br label %_block_

_block_:
  call void @logo_ponxy(double 0.0, double 0.0)
  call void @logo_ponrumbo(double 0.0)
  %t0 = load double, double* @var_ROJO
  %t1 = fptoui double %t0 to i32
  call void @logo_poncolor(i32 %t1)
  store double 150.0, double* @var_tam
  store double 0.0, double* @var_rotacion
  store double 0.0, double* @var_mitad
  call void @logo_bajalapiz()
  store double 4.0, double* @var_t1
  br label %L1

L1:
  %t2 = load double, double* @var_tam
  %t3 = fdiv double %t2, 2.0
  store double %t3, double* @var_t2
  %t4 = load double, double* @var_t2
  store double %t4, double* @var_mitad
  %t5 = load double, double* @var_mitad
  call void @logo_retrocede(double %t5)
  call void @logo_giraderecha(double 90.0)
  %t6 = load double, double* @var_mitad
  call void @logo_retrocede(double %t6)
  call void @logo_giraizquierda(double 90.0)
  store double 4.0, double* @var_t3
  br label %L3

L3:
  %t7 = load double, double* @var_tam
  call void @logo_avanza(double %t7)
  call void @logo_giraderecha(double 90.0)
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
  call void @logo_ponxy(double 0.0, double 0.0)
  call void @logo_bajalapiz()
  %t16 = load double, double* @var_rotacion
  %t17 = fadd double %t16, 63.0
  store double %t17, double* @var_t6
  %t18 = load double, double* @var_t6
  store double %t18, double* @var_rotacion
  %t19 = load double, double* @var_rotacion
  call void @logo_ponrumbo(double %t19)
  %t20 = load double, double* @var_tam
  %t21 = fadd double %t20, 40.0
  store double %t21, double* @var_t7
  %t22 = load double, double* @var_t7
  store double %t22, double* @var_tam
  %t23 = load double, double* @var_t1
  %t24 = fsub double %t23, 1.0
  store double %t24, double* @var_t8
  %t25 = load double, double* @var_t8
  store double %t25, double* @var_t1
  %t26 = load double, double* @var_t1
  %t27 = fcmp ogt double %t26, 0.0
  %t28 = uitofp i1 %t27 to double
  store double %t28, double* @var_t9
  %t29 = load double, double* @var_t9
  %t30 = fcmp one double %t29, 0.0
  br i1 %t30, label %L1, label %cjmp_false_1

cjmp_false_1:
  br label %L2

L2:
  call void @logo_subelapiz()
  call void @logo_ponxy(double 0.0, double 0.0)
  call void @logo_ponrumbo(double 0.0)
  %t31 = load double, double* @var_ROJO
  %t32 = fptoui double %t31 to i32
  call void @logo_poncolor(i32 %t32)
  store double 180.0, double* @var_tam
  store double 0.0, double* @var_rotacion
  call void @logo_bajalapiz()
  store double 4.0, double* @var_t10
  br label %L5

L5:
  %t33 = load double, double* @var_tam
  %t34 = fdiv double %t33, 2.0
  store double %t34, double* @var_t11
  %t35 = load double, double* @var_t11
  store double %t35, double* @var_mitad
  %t36 = load double, double* @var_mitad
  call void @logo_retrocede(double %t36)
  call void @logo_giraderecha(double 90.0)
  %t37 = load double, double* @var_mitad
  call void @logo_retrocede(double %t37)
  call void @logo_giraizquierda(double 90.0)
  store double 4.0, double* @var_t12
  br label %L7

L7:
  %t38 = load double, double* @var_tam
  call void @logo_avanza(double %t38)
  call void @logo_giraderecha(double 90.0)
  %t39 = load double, double* @var_t12
  %t40 = fsub double %t39, 1.0
  store double %t40, double* @var_t13
  %t41 = load double, double* @var_t13
  store double %t41, double* @var_t12
  %t42 = load double, double* @var_t12
  %t43 = fcmp ogt double %t42, 0.0
  %t44 = uitofp i1 %t43 to double
  store double %t44, double* @var_t14
  %t45 = load double, double* @var_t14
  %t46 = fcmp one double %t45, 0.0
  br i1 %t46, label %L7, label %cjmp_false_2

cjmp_false_2:
  br label %L8

L8:
  call void @logo_subelapiz()
  call void @logo_ponxy(double 0.0, double 0.0)
  call void @logo_bajalapiz()
  %t47 = load double, double* @var_rotacion
  %t48 = fsub double %t47, 47.0
  store double %t48, double* @var_t15
  %t49 = load double, double* @var_t15
  store double %t49, double* @var_rotacion
  %t50 = load double, double* @var_rotacion
  call void @logo_ponrumbo(double %t50)
  %t51 = load double, double* @var_tam
  %t52 = fadd double %t51, 50.0
  store double %t52, double* @var_t16
  %t53 = load double, double* @var_t16
  store double %t53, double* @var_tam
  %t54 = load double, double* @var_t10
  %t55 = fsub double %t54, 1.0
  store double %t55, double* @var_t17
  %t56 = load double, double* @var_t17
  store double %t56, double* @var_t10
  %t57 = load double, double* @var_t10
  %t58 = fcmp ogt double %t57, 0.0
  %t59 = uitofp i1 %t58 to double
  store double %t59, double* @var_t18
  %t60 = load double, double* @var_t18
  %t61 = fcmp one double %t60, 0.0
  br i1 %t61, label %L5, label %cjmp_false_3

cjmp_false_3:
  br label %L6

L6:
  call void @logo_subelapiz()
  call void @logo_ponxy(double 0.0, double 0.0)
  call void @logo_ponrumbo(double 0.0)
  %t62 = load double, double* @var_ROJO
  %t63 = fptoui double %t62 to i32
  call void @logo_poncolor(i32 %t63)
  store double 200.0, double* @var_tam
  store double 0.0, double* @var_rotacion
  call void @logo_bajalapiz()
  store double 4.0, double* @var_t19
  br label %L9

L9:
  %t64 = load double, double* @var_tam
  %t65 = fdiv double %t64, 2.0
  store double %t65, double* @var_t20
  %t66 = load double, double* @var_t20
  store double %t66, double* @var_mitad
  %t67 = load double, double* @var_mitad
  call void @logo_retrocede(double %t67)
  call void @logo_giraderecha(double 90.0)
  %t68 = load double, double* @var_mitad
  call void @logo_retrocede(double %t68)
  call void @logo_giraizquierda(double 90.0)
  store double 4.0, double* @var_t21
  br label %L11

L11:
  %t69 = load double, double* @var_tam
  call void @logo_avanza(double %t69)
  call void @logo_giraderecha(double 90.0)
  %t70 = load double, double* @var_t21
  %t71 = fsub double %t70, 1.0
  store double %t71, double* @var_t22
  %t72 = load double, double* @var_t22
  store double %t72, double* @var_t21
  %t73 = load double, double* @var_t21
  %t74 = fcmp ogt double %t73, 0.0
  %t75 = uitofp i1 %t74 to double
  store double %t75, double* @var_t23
  %t76 = load double, double* @var_t23
  %t77 = fcmp one double %t76, 0.0
  br i1 %t77, label %L11, label %cjmp_false_4

cjmp_false_4:
  br label %L12

L12:
  call void @logo_subelapiz()
  call void @logo_ponxy(double 0.0, double 0.0)
  call void @logo_bajalapiz()
  %t78 = load double, double* @var_rotacion
  %t79 = fadd double %t78, 108.0
  store double %t79, double* @var_t24
  %t80 = load double, double* @var_t24
  store double %t80, double* @var_rotacion
  %t81 = load double, double* @var_rotacion
  call void @logo_ponrumbo(double %t81)
  %t82 = load double, double* @var_tam
  %t83 = fadd double %t82, 60.0
  store double %t83, double* @var_t25
  %t84 = load double, double* @var_t25
  store double %t84, double* @var_tam
  %t85 = load double, double* @var_t19
  %t86 = fsub double %t85, 1.0
  store double %t86, double* @var_t26
  %t87 = load double, double* @var_t26
  store double %t87, double* @var_t19
  %t88 = load double, double* @var_t19
  %t89 = fcmp ogt double %t88, 0.0
  %t90 = uitofp i1 %t89 to double
  store double %t90, double* @var_t27
  %t91 = load double, double* @var_t27
  %t92 = fcmp one double %t91, 0.0
  br i1 %t92, label %L9, label %cjmp_false_5

cjmp_false_5:
  br label %L10

L10:
  call void @logo_subelapiz()
  call void @logo_ponxy(double 0.0, double 0.0)
  call void @logo_ponrumbo(double 0.0)
  %t93 = load double, double* @var_ROJO
  %t94 = fptoui double %t93 to i32
  call void @logo_poncolor(i32 %t94)
  store double 120.0, double* @var_tam
  store double 0.0, double* @var_rotacion
  call void @logo_bajalapiz()
  store double 4.0, double* @var_t28
  br label %L13

L13:
  %t95 = load double, double* @var_tam
  %t96 = fdiv double %t95, 2.0
  store double %t96, double* @var_t29
  %t97 = load double, double* @var_t29
  store double %t97, double* @var_mitad
  %t98 = load double, double* @var_mitad
  call void @logo_retrocede(double %t98)
  call void @logo_giraderecha(double 90.0)
  %t99 = load double, double* @var_mitad
  call void @logo_retrocede(double %t99)
  call void @logo_giraizquierda(double 90.0)
  store double 4.0, double* @var_t30
  br label %L15

L15:
  %t100 = load double, double* @var_tam
  call void @logo_avanza(double %t100)
  call void @logo_giraderecha(double 90.0)
  %t101 = load double, double* @var_t30
  %t102 = fsub double %t101, 1.0
  store double %t102, double* @var_t31
  %t103 = load double, double* @var_t31
  store double %t103, double* @var_t30
  %t104 = load double, double* @var_t30
  %t105 = fcmp ogt double %t104, 0.0
  %t106 = uitofp i1 %t105 to double
  store double %t106, double* @var_t32
  %t107 = load double, double* @var_t32
  %t108 = fcmp one double %t107, 0.0
  br i1 %t108, label %L15, label %cjmp_false_6

cjmp_false_6:
  br label %L16

L16:
  call void @logo_subelapiz()
  call void @logo_ponxy(double 0.0, double 0.0)
  call void @logo_bajalapiz()
  %t109 = load double, double* @var_rotacion
  %t110 = fsub double %t109, 134.0
  store double %t110, double* @var_t33
  %t111 = load double, double* @var_t33
  store double %t111, double* @var_rotacion
  %t112 = load double, double* @var_rotacion
  call void @logo_ponrumbo(double %t112)
  %t113 = load double, double* @var_tam
  %t114 = fadd double %t113, 55.0
  store double %t114, double* @var_t34
  %t115 = load double, double* @var_t34
  store double %t115, double* @var_tam
  %t116 = load double, double* @var_t28
  %t117 = fsub double %t116, 1.0
  store double %t117, double* @var_t35
  %t118 = load double, double* @var_t35
  store double %t118, double* @var_t28
  %t119 = load double, double* @var_t28
  %t120 = fcmp ogt double %t119, 0.0
  %t121 = uitofp i1 %t120 to double
  store double %t121, double* @var_t36
  %t122 = load double, double* @var_t36
  %t123 = fcmp one double %t122, 0.0
  br i1 %t123, label %L13, label %cjmp_false_7

cjmp_false_7:
  br label %L14

L14:
  call void @logo_subelapiz()
  call void @logo_ponxy(double 0.0, double 0.0)
  call void @logo_ocultatortuga()
  ret i32 0
}
