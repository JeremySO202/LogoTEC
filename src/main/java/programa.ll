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
@_str_contador = private constant [9 x i8] c"contador\00"

@var__block_ = global double 0.0
@var_contador = global double 0.0

define i32 @main() {
entry:
  call void @logo_reset()
  store double 2.0, double* @var_contador
  %ptr0 = getelementptr [9 x i8], [9 x i8]* @_str_contador, i32 0, i32 0
  %cast0 = bitcast i8* %ptr0 to i8*
  call void @logo_inic(i8* %cast0, double 2.0)
  call void @logo_avanza(double 15.0)
  store double 3.0, double* @var_contador
  %ptr1 = getelementptr [9 x i8], [9 x i8]* @_str_contador, i32 0, i32 0
  %cast1 = bitcast i8* %ptr1 to i8*
  call void @logo_haz(i8* %cast1, double 3.0)
  ret i32 0
}
