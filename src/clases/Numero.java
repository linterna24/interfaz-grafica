
package clases;

public class Numero {
    private Integer valor1;
    private Integer valor2;
    private Integer valor3;
    private Integer valor4;

    public Numero() {
    }

    public Numero(Integer valor1, Integer valor2, Integer valor3, Integer valor4) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
        this.valor4 = valor4;
    }

    public Integer getValor1() {
        return valor1;
    }

    public void setValor1(Integer valor1) {
        this.valor1 = valor1;
    }

    public Integer getValor2() {
        return valor2;
    }

    public void setValor2(Integer valor2) {
        this.valor2 = valor2;
    }

    public Integer getValor3() {
        return valor3;
    }

    public void setValor3(Integer valor3) {
        this.valor3 = valor3;
    }

    public Integer getValor4() {
        return valor4;
    }

    public void setValor4(Integer valor4) {
        this.valor4 = valor4;
    }
    
    public Integer Sumar(){
    return valor1+valor2+valor3+valor4;
    }
    
}
