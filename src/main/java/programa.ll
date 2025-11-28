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

@var_t1 = global double 0.0
@var_t2 = global double 0.0
@var_t3 = global double 0.0

define i32 @main(i32 %argc, i8** %argv) {
entry:
  call void @logo_init_runtime(i32 %argc, i8** %argv)
  call void @logo_reset()
  br label %_block_

_block_:
  store double 4.0, double* @var_t1
  br label %L1

L1:
  call void @logo_avanza(double 100.0)
  call void @logo_giraderecha(double 90.0)
  %t0 = load double, double* @var_t1
  %t1 = fsub double %t0, 1.0
  store double %t1, double* @var_t2
  %t2 = load double, double* @var_t2
  store double %t2, double* @var_t1
  %t3 = load double, double* @var_t1
  %t4 = fcmp ogt double %t3, 0.0
  %t5 = uitofp i1 %t4 to double
  store double %t5, double* @var_t3
  %t6 = load double, double* @var_t3
  %t7 = fcmp one double %t6, 0.0
  br i1 %t7, label %L1, label %cjmp_false_0

cjmp_false_0:
  br label %L2

L2:
  ret i32 0
}
