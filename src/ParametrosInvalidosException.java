
public class ParametrosInvalidosException extends Exception {
    
    // public ParametrosInvalidosException(String string) {
    // }

    // public void verificar(int parametroDois, int parametroUm) throws ParametrosInvalidosException{
    //     if(parametroUm > parametroDois){
    //         throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        
    //     }
    // }

    // public void verificar(boolean b) {
    // }
        
        public ParametrosInvalidosException(String message) {
        super(message);
    }

}
