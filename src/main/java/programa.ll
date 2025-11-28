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

@var_ROJO = global double 0.0
@var_mitad = global double 0.0
@var_rotacion = global double 0.0
@var_t1 = global double 0.0
@var_t2 = global double 0.0
@var_t3 = global double 0.0
@var_t4 = global double 0.0
@var_t5 = global double 0.0
@var_t6 = global double 0.0
@var_t7 = global double 0.0
@var_t8 = global double 0.0
@var_t9 = global double 0.0
@var_tam = global double 0.0

define i32 @main(i32 %argc, i8** %argv) {
entry:
  call void @logo_init_runtime(i32 %argc, i8** %argv)
  call void @logo_reset()
  br label %_block_

_block_:
  call void @logo_ponxy(double 0.0, double 0.0)
  call void @logo_ponrumbo(double 0.0)
  %t0 = load double, double* @var_ROJO
  %t1 = fptoui double %t0 to i32
  call void @logo_poncolor(i32 %t1)
  store double 20.0, double* @var_tam
  store double 0.0, double* @var_rotacion
  store double 0.0, double* @var_mitad
  call void @logo_bajalapiz()
  store double 80.0, double* @var_t1
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
  %t17 = fadd double %t16, 3.0
  store double %t17, double* @var_t6
  %t18 = load double, double* @var_t6
  store double %t18, double* @var_rotacion
  %t19 = load double, double* @var_rotacion
  call void @logo_ponrumbo(double %t19)
  %t20 = load double, double* @var_tam
  %t21 = fadd double %t20, 3.0
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
  call void @logo_ocultatortuga()
  ret i32 0
}
