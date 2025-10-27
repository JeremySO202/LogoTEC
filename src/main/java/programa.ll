; LLVM IR generado para LLVM 14
declare void @logo_reset()
declare void @logo_avanza(double)
declare void @logo_retrocede(double)
declare void @logo_giraderecha(double)
declare void @logo_giraizquierda(double)
declare void @logo_ponpos(double,double)
declare void @logo_ponxy(double,double)
declare void @logo_ponrumbo(double)
declare void @logo_ponx(double)
declare void @logo_pony(double)
declare void @logo_centro()
declare void @logo_inic(i8*, double)
declare void @logo_haz(i8*, double)
declare void @logo_inc(double, double)
declare double @logo_suma(double,double)
declare double @logo_diferencia(double,double)
declare double @logo_producto(double,double)
declare double @logo_division(double,double)
declare double @logo_potencia(double,double)
declare double @logo_azar(double)
declare i32 @logo_iguales(double,double)
declare i32 @logo_mayorque(double,double)
declare i32 @logo_menorque(double,double)

@_str__block_ = private constant [8 x i8] c"<block>\00"
@_str_L1 = private constant [3 x i8] c"L1\00"
@_str_L2 = private constant [3 x i8] c"L2\00"
@_str_L3 = private constant [3 x i8] c"L3\00"
@_str_L4 = private constant [3 x i8] c"L4\00"
@_str_suma_total = private constant [11 x i8] c"suma_total\00"
@_str_x = private constant [2 x i8] c"x\00"
@_str_y = private constant [2 x i8] c"y\00"

@var__block_ = global double 0.0
@var_L1 = global double 0.0
@var_L2 = global double 0.0
@var_L3 = global double 0.0
@var_L4 = global double 0.0
@var_suma_total = global double 0.0
@var_x = global double 0.0
@var_y = global double 0.0
@temp_t1 = global double 0.0
@temp_t2 = global double 0.0
@temp_t3 = global double 0.0
@temp_test_basico = global double 0.0

define i32 @main() {
entry:
  call void @logo_reset()
  store double 10.0, double* @var_x
  %ptr0 = getelementptr [2 x i8], [2 x i8]* @_str_x, i32 0, i32 0
  %cast0 = bitcast i8* %ptr0 to i8*
  call void @logo_inic(i8* %cast0, double 10.0)
  store double 20.0, double* @var_y
  %ptr1 = getelementptr [2 x i8], [2 x i8]* @_str_y, i32 0, i32 0
  %cast1 = bitcast i8* %ptr1 to i8*
  call void @logo_inic(i8* %cast1, double 20.0)
  %v36456814605038950 = load double, double* @temp_t1
  store double %v36456814605038950, double* @var_suma_total
  %ptr2 = getelementptr [11 x i8], [11 x i8]* @_str_suma_total, i32 0, i32 0
  %cast2 = bitcast i8* %ptr2 to i8*
  call void @logo_inic(i8* %cast2, double %v36456814605038950)
  store double 10.0, double* @temp_test_basico
  call void @logo_avanza(double 100.0)
  store double 3.0, double* @temp_t3
  call void @logo_avanza(double 80.0)
  ret i32 0
}
