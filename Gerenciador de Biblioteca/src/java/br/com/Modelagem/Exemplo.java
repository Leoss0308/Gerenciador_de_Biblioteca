/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelagem;

/**
 *
 * @author i7
 */
public class Exemplo {

    
    
    public Exemplo(){
    /*
    Oi, eu sou o contrutor da classe e gosto muito de estar em todas as classes
    então por favor me escreva quando vc criar a classe :D
    A menos que ela seja abstrata eu não gosto delas :(
    */
    }
    
    
/*
Boas praticas de programação
    1. idente seu codigo, ele vai fica mais feliz com vc :)
    2. nome de variavel e metodo é minusculo
    3. caso o atributo ou metodo tenha dois nome como no exemplo abaixo o 
    primeiro nome em minusculo e o segundo nome é em maisculo
    4. zere as variaveis...o java faz isso automaticamente mas ninguem confia
    nele...os erros de instanciação agradece

    
*/

    
    private int atributoSegundoNome = 0;
    private String atributo2 = "";

/*deve-se encapsular:
    na linha abixo dos atributos
    apertando o botão direito
    Inserir codigo
    Getter e Setter...
    selecionar todos os atributos
    Gerar
    e deve ficar algo como ai embaixo
*/ 

    public int getAtributoSegundoNome() {
        return atributoSegundoNome;
    }

    public void setAtributoSegundoNome(int atributoSegundoNome) {
        this.atributoSegundoNome = atributoSegundoNome;
    }


    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }

/*
    os metodos devem ser escritos como abaixo sem nada dentro
    a não ser o return caso o metodo não seja void
*/
    
    public void metodoAleatorio(){
    
    }
    
    public int metodoAleatorio2(){
        return 0;
    }
   
    
}
