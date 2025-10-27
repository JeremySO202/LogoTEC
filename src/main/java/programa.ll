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

@var_AZUL = global double 0.0
@var_suma_total = global double 0.0
@var_t1 = global double 0.0
@var_t2 = global double 0.0
@var_t3 = global double 0.0
@var_t4 = global double 0.0
@var_t5 = global double 0.0
@var_t6 = global double 0.0
@var_x = global double 0.0
@var_y = global double 0.0
@var_z = global double 0.0

define i32 @main() {
entry:
  call void @logo_reset()
  br label %_block_

_block_:
  store double 10.0, double* @var_x
  store double 20.0, double* @var_y
  %t0 = load double, double* @var_x
  %t1 = load double, double* @var_y
  %t2 = fadd double %t0, %t1
  store double %t2, double* @var_t1
  %t3 = load double, double* @var_t1
  store double %t3, double* @var_z
  %t4 = load double, double* @var_x
  %t5 = load double, double* @var_y
  %t6 = fadd double %t4, %t5
  store double %t6, double* @var_t2
  %t7 = load double, double* @var_t2
  store double %t7, double* @var_suma_total
  call void @logo_centro()
  call void @logo_bajalapiz()
  %t8 = load double, double* @var_AZUL
  %t9 = fptoui double %t8 to i32
  call void @logo_poncolor(i32 %t9)
  call void @logo_espera(double 1000.0)
  %t10 = load double, double* @var_x
  %t11 = fcmp oeq double %t10, 10.0
  %t12 = uitofp i1 %t11 to double
  store double %t12, double* @var_t3
  %t13 = load double, double* @var_t3
  %t14 = fcmp one double %t13, 0.0
  br i1 %t14, label %L1, label %cjmp_false_0

cjmp_false_0:
  br label %L2

L1:
  call void @logo_avanza(double 100.0)
  call void @logo_giraderecha(double 90.0)
  br label %L2

L2:
  store double 3.0, double* @var_t4
  br label %L3

L3:
  call void @logo_giraderecha(double 120.0)
  call void @logo_avanza(double 80.0)
  %t15 = load double, double* @var_t4
  %t16 = fsub double %t15, 1.0
  store double %t16, double* @var_t5
  %t17 = load double, double* @var_t5
  store double %t17, double* @var_t4
  %t18 = load double, double* @var_t4
  %t19 = fcmp ogt double %t18, 0.0
  %t20 = uitofp i1 %t19 to double
  store double %t20, double* @var_t6
  %t21 = load double, double* @var_t6
  %t22 = fcmp one double %t21, 0.0
  br i1 %t22, label %L3, label %cjmp_false_1

cjmp_false_1:
  br label %L4

L4:
  call void @logo_subelapiz()
  call void @logo_ponxy(double 50.0, double 50.0)
  call void @logo_bajalapiz()
  call void @logo_ocultatortuga()
  ret i32 0
}
