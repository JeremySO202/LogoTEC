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

define i32 @main() {
entry:
  call void @logo_reset()
  br label %_block_

_block_:
  call void @logo_ponxy(double 0.0, double 0.0)
  call void @logo_ponrumbo(double 0.0)
  %t0 = fptoui double 2.0 to i32
  call void @logo_poncolor(i32 %t0)
  store double 20.0, double* @var_tam
  store double 0.0, double* @var_rotacion
  store double 0.0, double* @var_mitad
  call void @logo_bajalapiz()
  store double 80.0, double* @var_t1
  br label %L1

L1:
  %t1 = load double, double* @var_tam
  %t2 = fdiv double %t1, 2.0
  store double %t2, double* @var_t2
  %t3 = load double, double* @var_t2
  store double %t3, double* @var_mitad
  %t4 = load double, double* @var_mitad
  call void @logo_retrocede(double %t4)
  call void @logo_giraderecha(double 90.0)
  %t5 = load double, double* @var_mitad
  call void @logo_retrocede(double %t5)
  call void @logo_giraizquierda(double 90.0)
  store double 4.0, double* @var_t3
  br label %L3

L3:
  %t6 = load double, double* @var_tam
  call void @logo_avanza(double %t6)
  call void @logo_giraderecha(double 90.0)
  %t7 = load double, double* @var_t3
  %t8 = fsub double %t7, 1.0
  store double %t8, double* @var_t4
  %t9 = load double, double* @var_t4
  store double %t9, double* @var_t3
  %t10 = load double, double* @var_t3
  %t11 = fcmp ogt double %t10, 0.0
  %t12 = uitofp i1 %t11 to double
  store double %t12, double* @var_t5
  %t13 = load double, double* @var_t5
  %t14 = fcmp one double %t13, 0.0
  br i1 %t14, label %L3, label %cjmp_false_0

cjmp_false_0:
  br label %L4

L4:
  call void @logo_subelapiz()
  call void @logo_ponxy(double 0.0, double 0.0)
  call void @logo_bajalapiz()
  %t15 = load double, double* @var_rotacion
  %t16 = fadd double %t15, 3.0
  store double %t16, double* @var_t6
  %t17 = load double, double* @var_t6
  store double %t17, double* @var_rotacion
  %t18 = load double, double* @var_rotacion
  call void @logo_ponrumbo(double %t18)
  %t19 = load double, double* @var_tam
  %t20 = fadd double %t19, 3.0
  store double %t20, double* @var_t7
  %t21 = load double, double* @var_t7
  store double %t21, double* @var_tam
  %t22 = load double, double* @var_t1
  %t23 = fsub double %t22, 1.0
  store double %t23, double* @var_t8
  %t24 = load double, double* @var_t8
  store double %t24, double* @var_t1
  %t25 = load double, double* @var_t1
  %t26 = fcmp ogt double %t25, 0.0
  %t27 = uitofp i1 %t26 to double
  store double %t27, double* @var_t9
  %t28 = load double, double* @var_t9
  %t29 = fcmp one double %t28, 0.0
  br i1 %t29, label %L1, label %cjmp_false_1

cjmp_false_1:
  br label %L2

L2:
  call void @logo_subelapiz()
  call void @logo_ocultatortuga()
  ret i32 0
}
