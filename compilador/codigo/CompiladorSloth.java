/* CompiladorSloth.java */
/* Generated By:JavaCC: Do not edit this line. CompiladorSloth.java */
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CompiladorSloth implements CompiladorSlothConstants {
    private static Codigo cod = null;

        public static void main(String[] args) throws ParseException
        {
                System.out.println("\n--->  Sloth Compiler  <---\n");

                try{
                        String fname = args[0];
            File f = new File(fname) ;
                        FileReader fr = new FileReader(f);
                        BufferedReader br = new BufferedReader(fr);
                        cod = new Codigo(tokenImage, fname);

            CompiladorSloth cs = new CompiladorSloth(fr);
            cs.Programa();
                        System.out.println("File "+fname+" was successful compiled");
        }
                catch(ParseException e)
                {
                        System.out.println("Compiler Error: An error occurred.");
                        System.out.println(e.getMessage());
                }
                catch (IOException e) {
                System.out.println("File Error: An error occurred.");
                System.out.println(e.getMessage());
        }
                catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("Argument Error: No file at program argument.");
                }
                System.out.println();
                //cod.printTokens();
                //cod.printVars();
        }

  final public void Programa() throws ParseException {Token a,b;
    label_1:
    while (true) {
      if (jj_2_1(2)) {
        ;
      } else {
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IMPORT:{
        Importacao();
        break;
        }
      case COMENT:{
        a = jj_consume_token(COMENT);
cod.add(a);
        break;
        }
      case TIPOINT:
      case TIPODOUBLE:
      case TIPOCHAR:
      case TIPOSTRING:
      case TIPOBOOLEAN:
      case TIPOVOID:{
        Funcao();
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case FIRST:{
      Execucao();
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      ;
    }
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMENT:{
        ;
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
      b = jj_consume_token(COMENT);
cod.add(b);
    }
    jj_consume_token(0);
}

  final public void Funcao() throws ParseException {Token a=null,b,c,d; Variable var=null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TIPOVOID:{
      a = jj_consume_token(TIPOVOID);
cod.add(a);cod.setHasReturn(true);
      break;
      }
    case TIPOINT:
    case TIPODOUBLE:
    case TIPOCHAR:
    case TIPOSTRING:
    case TIPOBOOLEAN:{
      a = TipoVar();
cod.openFunc();
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
cod.setScope(a.kind);
    b = jj_consume_token(NOMEVAR);
cod.add(b);var=cod.addDVarList(b.image, a.kind, b);
    c = jj_consume_token(ABREPAR);
cod.add(c);cod.openBloco();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TIPOINT:
    case TIPODOUBLE:
    case TIPOCHAR:
    case TIPOSTRING:
    case TIPOBOOLEAN:{
      FuncPar(var);
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      ;
    }
    d = jj_consume_token(FECHAPAR);
cod.add(d);
    Bloco();
cod.closeBloco();cod.closeFunc();
}

  final public void FuncPar(Variable var) throws ParseException {Token a, b;
    b = TipoVar();
var.addParameter(b.kind);
    DeclaraVar(b);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case SEPFUN:{
      a = jj_consume_token(SEPFUN);
cod.add(a);
      FuncPar(var);
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      ;
    }
}

  final public void Retorno() throws ParseException {Token a;
    a = jj_consume_token(RETORNO);
cod.add(a);
        cod.openExpressao(cod.getScope());
        cod.setHasReturn(true);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TRUE:
    case FALSE:
    case ABREPAR:
    case NOT:
    case NOMEVAR:
    case STRING:
    case INTEIRO:
    case CARACTER:
    case REAL:
    case PORCENTAGEM:{
      Expressao();
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      ;
    }
cod.closeExpressao();
}

  final public Token ChamaFuncao() throws ParseException {Token a,b,exp;
    exp = jj_consume_token(NOMEVAR);
cod.add(exp);cod.openChamaFunc(exp);
    a = jj_consume_token(ABREPAR);
cod.add(a);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TRUE:
    case FALSE:
    case ABREPAR:
    case NOT:
    case NOMEVAR:
    case STRING:
    case INTEIRO:
    case CARACTER:
    case REAL:
    case PORCENTAGEM:{
      ChamaFuncPar(exp);
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      ;
    }
    b = jj_consume_token(FECHAPAR);
cod.add(b);
        cod.checkParameters(exp);
        {if ("" != null) return exp;}
    throw new Error("Missing return statement in function");
}

  final public void ChamaFuncPar(Token exp) throws ParseException {Token a, b=null; int paramType;
paramType=cod.getNextParam(exp);cod.openExpressao(paramType+9);
    Expressao();
cod.closeExpressao();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case SEPFUN:{
      a = jj_consume_token(SEPFUN);
cod.add(a);
      ChamaFuncPar(exp);
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      ;
    }
}

  final public void Importacao() throws ParseException {Token a,b;
    a = jj_consume_token(IMPORT);
    b = jj_consume_token(STRING);
try{
                        String fname = b.image;
                        fname = fname.substring(0, fname.length()-1);
                        fname = fname.substring(1);

            File f = new File(fname) ;
            CompiladorSloth cs = new CompiladorSloth(new FileReader(f));
            cs.Programa();
        }
                catch (IOException e) {
                System.out.println("File Error: An error occurred.");
                System.out.println(e.getMessage());
        }
}

  final public void Execucao() throws ParseException {Token a,b,c;
    a = jj_consume_token(FIRST);
cod.add(a);
        cod.verificaFirst();
        cod.setScope(14);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TIPOINT:
      case TIPODOUBLE:
      case TIPOCHAR:
      case TIPOSTRING:
      case TIPOBOOLEAN:
      case RETORNO:
      case IF:
      case FOR:
      case WHILE:
      case FOREACH:
      case WRITE:
      case COMENT:
      case NOMEVAR:{
        ;
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        break label_3;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TIPOINT:
      case TIPODOUBLE:
      case TIPOCHAR:
      case TIPOSTRING:
      case TIPOBOOLEAN:
      case RETORNO:
      case IF:
      case FOR:
      case WHILE:
      case FOREACH:
      case WRITE:
      case NOMEVAR:{
        Linha();
        break;
        }
      case COMENT:{
        b = jj_consume_token(COMENT);
cod.add(b);
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    c = jj_consume_token(LAST);
cod.add(c);
}

  final public void Linha() throws ParseException {Token a;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TIPOINT:
    case TIPODOUBLE:
    case TIPOCHAR:
    case TIPOSTRING:
    case TIPOBOOLEAN:
    case RETORNO:
    case WRITE:
    case NOMEVAR:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case WRITE:{
        Write();
        break;
        }
      case TIPOINT:
      case TIPODOUBLE:
      case TIPOCHAR:
      case TIPOSTRING:
      case TIPOBOOLEAN:
      case NOMEVAR:{
        ManVar();
        break;
        }
      case RETORNO:{
        Retorno();
        break;
        }
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      a = jj_consume_token(EOL);
cod.add(a);
      break;
      }
    case IF:
    case FOR:
    case WHILE:
    case FOREACH:{
      FluxoDados();
      break;
      }
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void Write() throws ParseException {Token a,b,c;
    a = jj_consume_token(WRITE);
cod.add(a);
    b = jj_consume_token(ABREPAR);
cod.add(b);
        cod.openExpressao(12);
    Expressao();
cod.closeExpressao();
    c = jj_consume_token(FECHAPAR);
cod.add(c);
}

  final public void ManVar() throws ParseException {Token a,b;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TIPOINT:
    case TIPODOUBLE:
    case TIPOCHAR:
    case TIPOSTRING:
    case TIPOBOOLEAN:{
      a = TipoVar();
      ManVarSeq(a);
      break;
      }
    case NOMEVAR:{
      if (jj_2_2(3)) {
        b = NomeVar();
        Atribuicao(cod.getVarType(b)+9);
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case NOMEVAR:{
          ChamaFuncao();
          break;
          }
        default:
          jj_la1[13] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      break;
      }
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void ManVarSeq(Token b) throws ParseException {Token a;
    DeclaraVar(b);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case SEPFUN:{
      a = jj_consume_token(SEPFUN);
cod.add(a);
      ManVarSeq(b);
      break;
      }
    default:
      jj_la1[15] = jj_gen;
      ;
    }
}

  final public Token TipoVar() throws ParseException {Token a=null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TIPOBOOLEAN:{
      a = jj_consume_token(TIPOBOOLEAN);
      break;
      }
    case TIPOCHAR:{
      a = jj_consume_token(TIPOCHAR);
      break;
      }
    case TIPODOUBLE:{
      a = jj_consume_token(TIPODOUBLE);
      break;
      }
    case TIPOINT:{
      a = jj_consume_token(TIPOINT);
      break;
      }
    case TIPOSTRING:{
      a = jj_consume_token(TIPOSTRING);
      break;
      }
    default:
      jj_la1[16] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
cod.add(a);
                {if ("" != null) return a;}
    throw new Error("Missing return statement in function");
}

  final public Variable DeclaraVar(Token d) throws ParseException {Token a,b,c; Variable var=null;
    a = jj_consume_token(NOMEVAR);
cod.add(a);
                var=cod.addDVarList(a.image, d.kind, a);
    if (jj_2_3(2)) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ABREVET:{
        b = jj_consume_token(ABREVET);
cod.add(b);
        var.setIsVet(true);
        cod.openExpressao(9);
        Expressao();
cod.closeExpressao();
        c = jj_consume_token(FECHAVET);
cod.add(c);
        break;
        }
      case IGUALDADE:{
        Atribuicao(d.kind);
        break;
        }
      default:
        jj_la1[17] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } else {
      ;
    }
{if ("" != null) return var;}
    throw new Error("Missing return statement in function");
}

  final public Token NomeVar() throws ParseException {Token a,b,c; boolean vet = false; Variable var;
    a = jj_consume_token(NOMEVAR);
var=cod.verifyVarList(a);
        cod.add(a);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ABREVET:{
      b = jj_consume_token(ABREVET);
cod.add(b);
        vet = true;
        cod.openExpressao(9);
      Expressao();
cod.closeExpressao();
      c = jj_consume_token(FECHAVET);
cod.add(c);
      break;
      }
    default:
      jj_la1[18] = jj_gen;
      ;
    }
var.checkVet(vet);
        {if ("" != null) return a;}
    throw new Error("Missing return statement in function");
}

  final public void Atribuicao(int kind) throws ParseException {Token a;
    a = jj_consume_token(IGUALDADE);
cod.add(a);cod.openExpressao(kind);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case GET:{
      Read();
      break;
      }
    case TRUE:
    case FALSE:
    case ABREPAR:
    case NOT:
    case NOMEVAR:
    case STRING:
    case INTEIRO:
    case CARACTER:
    case REAL:
    case PORCENTAGEM:{
      Expressao();
      break;
      }
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
cod.closeExpressao();
}

  final public void Read() throws ParseException {Token a,b,c;
    a = jj_consume_token(GET);
cod.add(a);cod.addToExp(a);
    b = jj_consume_token(ABREPAR);
cod.add(b);
    c = jj_consume_token(FECHAPAR);
cod.add(c);
}

  final public void Expressao() throws ParseException {Token a,b,c,exp;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ABREPAR:{
      a = jj_consume_token(ABREPAR);
cod.add(a);cod.openParExp(a);
      label_4:
      while (true) {
        Expressao();
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case TRUE:
        case FALSE:
        case ABREPAR:
        case NOT:
        case NOMEVAR:
        case STRING:
        case INTEIRO:
        case CARACTER:
        case REAL:
        case PORCENTAGEM:{
          ;
          break;
          }
        default:
          jj_la1[20] = jj_gen;
          break label_4;
        }
      }
      b = jj_consume_token(FECHAPAR);
cod.add(b);cod.closeParExp(b);
      break;
      }
    case NOT:{
      c = jj_consume_token(NOT);
cod.add(c);cod.addOpToExp(c);
      Expressao();
      break;
      }
    case TRUE:
    case FALSE:
    case STRING:
    case INTEIRO:
    case CARACTER:
    case REAL:
    case PORCENTAGEM:{
      exp = ValorVar();
cod.addToExp(exp);
      break;
      }
    case NOMEVAR:{
      if (jj_2_4(2)) {
        exp = ChamaFuncao();
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case NOMEVAR:{
          exp = NomeVar();
          break;
          }
        default:
          jj_la1[21] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
cod.addToExp(exp);
      break;
      }
    default:
      jj_la1[22] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    if (jj_2_5(2)) {
      Operador();
      Expressao();
    } else {
      ;
    }
}

  final public void Operador() throws ParseException {Token a=null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ADD:
    case SUB:
    case MULT:
    case MOD:
    case DIV:
    case POW:{
      a = OpArit();
      break;
      }
    case IGUAL:
    case DIF:
    case MAIOR:
    case MENOR:
    case MAIGUAL:
    case MEIGUAL:
    case AND:
    case OR:
    case XOR:{
      a = OpRelac();
      break;
      }
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
cod.addOpToExp(a);
}

  final public Token OpArit() throws ParseException {Token a;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ADD:{
      a = jj_consume_token(ADD);
cod.add(a);
      break;
      }
    case SUB:{
      a = jj_consume_token(SUB);
cod.add(a);
      break;
      }
    case MOD:{
      a = jj_consume_token(MOD);
cod.add(a);
      break;
      }
    case DIV:{
      a = jj_consume_token(DIV);
cod.add(a);
      break;
      }
    case POW:{
      a = jj_consume_token(POW);
cod.add(a);
      break;
      }
    case MULT:{
      a = jj_consume_token(MULT);
cod.add(a);
      break;
      }
    default:
      jj_la1[24] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return a;}
    throw new Error("Missing return statement in function");
}

  final public Token OpRelac() throws ParseException {Token a;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case AND:{
      a = jj_consume_token(AND);
cod.add(a);
      break;
      }
    case OR:{
      a = jj_consume_token(OR);
cod.add(a);
      break;
      }
    case XOR:{
      a = jj_consume_token(XOR);
cod.add(a);
      break;
      }
    case IGUAL:{
      a = jj_consume_token(IGUAL);
cod.add(a);
      break;
      }
    case DIF:{
      a = jj_consume_token(DIF);
cod.add(a);
      break;
      }
    case MAIGUAL:{
      a = jj_consume_token(MAIGUAL);
cod.add(a);
      break;
      }
    case MEIGUAL:{
      a = jj_consume_token(MEIGUAL);
cod.add(a);
      break;
      }
    case MAIOR:{
      a = jj_consume_token(MAIOR);
cod.add(a);
      break;
      }
    case MENOR:{
      a = jj_consume_token(MENOR);
cod.add(a);
      break;
      }
    default:
      jj_la1[25] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return a;}
    throw new Error("Missing return statement in function");
}

  final public Token ValorVar() throws ParseException {Token a;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTEIRO:{
      a = jj_consume_token(INTEIRO);
cod.add(a);
      break;
      }
    case REAL:{
      a = jj_consume_token(REAL);
cod.add(a);
      break;
      }
    case CARACTER:{
      a = jj_consume_token(CARACTER);
cod.add(a);
      break;
      }
    case TRUE:
    case FALSE:{
      a = Booleano();
      break;
      }
    case PORCENTAGEM:{
      a = jj_consume_token(PORCENTAGEM);
cod.add(a);
      break;
      }
    case STRING:{
      a = jj_consume_token(STRING);
cod.add(a);
      break;
      }
    default:
      jj_la1[26] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return a;}
    throw new Error("Missing return statement in function");
}

  final public Token Booleano() throws ParseException {Token a;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TRUE:{
      a = jj_consume_token(TRUE);
cod.add(a);
      break;
      }
    case FALSE:{
      a = jj_consume_token(FALSE);
cod.add(a);
      break;
      }
    default:
      jj_la1[27] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return a;}
    throw new Error("Missing return statement in function");
}

  final public void FluxoDados() throws ParseException {
cod.openBloco();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case WHILE:{
      While();
      break;
      }
    case FOR:{
      For();
      break;
      }
    case FOREACH:{
      Foreach();
      break;
      }
    case IF:{
      If();
      break;
      }
    default:
      jj_la1[28] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
cod.closeBloco();
}

  final public void While() throws ParseException {Token a,b,c;
    a = jj_consume_token(WHILE);
cod.add(a);
    b = jj_consume_token(ABREPAR);
cod.add(b);
        cod.openExpressao(13);
    Expressao();
cod.closeExpressao();
    c = jj_consume_token(FECHAPAR);
cod.add(c);
    Bloco();
}

  final public void For() throws ParseException {Token a,b,c,d,e,f,g;
    a = jj_consume_token(FOR);
cod.add(a);
    b = jj_consume_token(ABREPAR);
cod.add(b);
    f = jj_consume_token(TIPOINT);
cod.add(f);
    g = jj_consume_token(NOMEVAR);
cod.add(g);cod.addDVarList(g.image,f.kind, g);
    Atribuicao(f.kind);
    d = jj_consume_token(SEPFOR);
cod.add(d);cod.openExpressao(9);
    Expressao();
cod.closeExpressao();
    d = jj_consume_token(SEPFOR);
cod.add(d);cod.openExpressao(9);
    Expressao();
cod.closeExpressao();
    e = jj_consume_token(FECHAPAR);
cod.add(e);
    Bloco();
}

  final public void Foreach() throws ParseException {Token a,b,c,d,e,f;
    a = jj_consume_token(FOREACH);
cod.add(a);
    b = jj_consume_token(ABREPAR);
cod.add(b);
    f = jj_consume_token(NOMEVAR);
cod.add(f);
    c = jj_consume_token(SEPFOR);
cod.add(c);
    e = jj_consume_token(NOMEVAR);
cod.add(e);
                cod.checkForeach(f, e);
    d = jj_consume_token(FECHAPAR);
cod.add(d);
    Bloco();
}

  final public void If() throws ParseException {Token a,b,c,d;
    a = jj_consume_token(IF);
cod.add(a);
    b = jj_consume_token(ABREPAR);
cod.add(b);
        cod.openExpressao(13);
    Expressao();
cod.closeExpressao();
    c = jj_consume_token(FECHAPAR);
cod.add(c);
    Bloco();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ELSE:{
      d = jj_consume_token(ELSE);
cod.add(d);
      Bloco();
      break;
      }
    default:
      jj_la1[29] = jj_gen;
      ;
    }
}

  final public void Bloco() throws ParseException {Token a,b,c;
    a = jj_consume_token(BEGIN);
cod.add(a);
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TIPOINT:
      case TIPODOUBLE:
      case TIPOCHAR:
      case TIPOSTRING:
      case TIPOBOOLEAN:
      case RETORNO:
      case IF:
      case FOR:
      case WHILE:
      case FOREACH:
      case WRITE:
      case COMENT:
      case NOMEVAR:{
        ;
        break;
        }
      default:
        jj_la1[30] = jj_gen;
        break label_5;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TIPOINT:
      case TIPODOUBLE:
      case TIPOCHAR:
      case TIPOSTRING:
      case TIPOBOOLEAN:
      case RETORNO:
      case IF:
      case FOR:
      case WHILE:
      case FOREACH:
      case WRITE:
      case NOMEVAR:{
        Linha();
        break;
        }
      case COMENT:{
        b = jj_consume_token(COMENT);
cod.add(b);
        break;
        }
      default:
        jj_la1[31] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    c = jj_consume_token(END);
cod.add(c);
}

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_1()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_2()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_3()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_2_4(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_4()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  private boolean jj_2_5(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_5()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  private boolean jj_3_1()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_6()) {
    jj_scanpos = xsp;
    if (jj_3R_7()) {
    jj_scanpos = xsp;
    if (jj_3R_8()) return true;
    }
    }
    return false;
  }

  private boolean jj_3R_24()
 {
    if (jj_scan_token(NOT)) return true;
    return false;
  }

  private boolean jj_3R_23()
 {
    if (jj_scan_token(ABREPAR)) return true;
    return false;
  }

  private boolean jj_3R_15()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_23()) {
    jj_scanpos = xsp;
    if (jj_3R_24()) {
    jj_scanpos = xsp;
    if (jj_3R_25()) {
    jj_scanpos = xsp;
    if (jj_3R_26()) return true;
    }
    }
    }
    return false;
  }

  private boolean jj_3R_29()
 {
    if (jj_scan_token(GET)) return true;
    return false;
  }

  private boolean jj_3R_10()
 {
    if (jj_scan_token(IGUALDADE)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_19()) {
    jj_scanpos = xsp;
    if (jj_3R_20()) return true;
    }
    return false;
  }

  private boolean jj_3R_28()
 {
    if (jj_3R_34()) return true;
    return false;
  }

  private boolean jj_3R_18()
 {
    if (jj_scan_token(ABREVET)) return true;
    if (jj_3R_15()) return true;
    return false;
  }

  private boolean jj_3R_58()
 {
    if (jj_scan_token(FALSE)) return true;
    return false;
  }

  private boolean jj_3R_57()
 {
    if (jj_scan_token(TRUE)) return true;
    return false;
  }

  private boolean jj_3R_16()
 {
    if (jj_scan_token(IMPORT)) return true;
    if (jj_scan_token(STRING)) return true;
    return false;
  }

  private boolean jj_3R_11()
 {
    if (jj_scan_token(ABREVET)) return true;
    if (jj_3R_15()) return true;
    return false;
  }

  private boolean jj_3R_56()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_57()) {
    jj_scanpos = xsp;
    if (jj_3R_58()) return true;
    }
    return false;
  }

  private boolean jj_3R_9()
 {
    if (jj_scan_token(NOMEVAR)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_18()) jj_scanpos = xsp;
    return false;
  }

  private boolean jj_3R_8()
 {
    if (jj_3R_17()) return true;
    return false;
  }

  private boolean jj_3R_55()
 {
    if (jj_scan_token(STRING)) return true;
    return false;
  }

  private boolean jj_3R_54()
 {
    if (jj_scan_token(PORCENTAGEM)) return true;
    return false;
  }

  private boolean jj_3R_53()
 {
    if (jj_3R_56()) return true;
    return false;
  }

  private boolean jj_3R_12()
 {
    if (jj_3R_10()) return true;
    return false;
  }

  private boolean jj_3R_52()
 {
    if (jj_scan_token(CARACTER)) return true;
    return false;
  }

  private boolean jj_3R_51()
 {
    if (jj_scan_token(REAL)) return true;
    return false;
  }

  private boolean jj_3R_50()
 {
    if (jj_scan_token(INTEIRO)) return true;
    return false;
  }

  private boolean jj_3R_32()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_50()) {
    jj_scanpos = xsp;
    if (jj_3R_51()) {
    jj_scanpos = xsp;
    if (jj_3R_52()) {
    jj_scanpos = xsp;
    if (jj_3R_53()) {
    jj_scanpos = xsp;
    if (jj_3R_54()) {
    jj_scanpos = xsp;
    if (jj_3R_55()) return true;
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3_3()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_11()) {
    jj_scanpos = xsp;
    if (jj_3R_12()) return true;
    }
    return false;
  }

  private boolean jj_3R_49()
 {
    if (jj_scan_token(MENOR)) return true;
    return false;
  }

  private boolean jj_3R_13()
 {
    if (jj_scan_token(NOMEVAR)) return true;
    if (jj_scan_token(ABREPAR)) return true;
    return false;
  }

  private boolean jj_3R_48()
 {
    if (jj_scan_token(MAIOR)) return true;
    return false;
  }

  private boolean jj_3R_47()
 {
    if (jj_scan_token(MEIGUAL)) return true;
    return false;
  }

  private boolean jj_3R_46()
 {
    if (jj_scan_token(MAIGUAL)) return true;
    return false;
  }

  private boolean jj_3R_20()
 {
    if (jj_3R_15()) return true;
    return false;
  }

  private boolean jj_3R_45()
 {
    if (jj_scan_token(DIF)) return true;
    return false;
  }

  private boolean jj_3R_44()
 {
    if (jj_scan_token(IGUAL)) return true;
    return false;
  }

  private boolean jj_3R_43()
 {
    if (jj_scan_token(XOR)) return true;
    return false;
  }

  private boolean jj_3R_42()
 {
    if (jj_scan_token(OR)) return true;
    return false;
  }

  private boolean jj_3R_41()
 {
    if (jj_scan_token(AND)) return true;
    return false;
  }

  private boolean jj_3R_34()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(13)) {
    jj_scanpos = xsp;
    if (jj_scan_token(11)) {
    jj_scanpos = xsp;
    if (jj_scan_token(10)) {
    jj_scanpos = xsp;
    if (jj_scan_token(9)) {
    jj_scanpos = xsp;
    if (jj_scan_token(12)) return true;
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_31()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_41()) {
    jj_scanpos = xsp;
    if (jj_3R_42()) {
    jj_scanpos = xsp;
    if (jj_3R_43()) {
    jj_scanpos = xsp;
    if (jj_3R_44()) {
    jj_scanpos = xsp;
    if (jj_3R_45()) {
    jj_scanpos = xsp;
    if (jj_3R_46()) {
    jj_scanpos = xsp;
    if (jj_3R_47()) {
    jj_scanpos = xsp;
    if (jj_3R_48()) {
    jj_scanpos = xsp;
    if (jj_3R_49()) return true;
    }
    }
    }
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_7()
 {
    if (jj_scan_token(COMENT)) return true;
    return false;
  }

  private boolean jj_3R_19()
 {
    if (jj_3R_29()) return true;
    return false;
  }

  private boolean jj_3R_22()
 {
    if (jj_3R_31()) return true;
    return false;
  }

  private boolean jj_3R_40()
 {
    if (jj_scan_token(MULT)) return true;
    return false;
  }

  private boolean jj_3R_39()
 {
    if (jj_scan_token(POW)) return true;
    return false;
  }

  private boolean jj_3R_38()
 {
    if (jj_scan_token(DIV)) return true;
    return false;
  }

  private boolean jj_3R_37()
 {
    if (jj_scan_token(MOD)) return true;
    return false;
  }

  private boolean jj_3R_36()
 {
    if (jj_scan_token(SUB)) return true;
    return false;
  }

  private boolean jj_3R_35()
 {
    if (jj_scan_token(ADD)) return true;
    return false;
  }

  private boolean jj_3_2()
 {
    if (jj_3R_9()) return true;
    if (jj_3R_10()) return true;
    return false;
  }

  private boolean jj_3R_30()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_35()) {
    jj_scanpos = xsp;
    if (jj_3R_36()) {
    jj_scanpos = xsp;
    if (jj_3R_37()) {
    jj_scanpos = xsp;
    if (jj_3R_38()) {
    jj_scanpos = xsp;
    if (jj_3R_39()) {
    jj_scanpos = xsp;
    if (jj_3R_40()) return true;
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_6()
 {
    if (jj_3R_16()) return true;
    return false;
  }

  private boolean jj_3R_21()
 {
    if (jj_3R_30()) return true;
    return false;
  }

  private boolean jj_3R_27()
 {
    if (jj_scan_token(TIPOVOID)) return true;
    return false;
  }

  private boolean jj_3R_14()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_21()) {
    jj_scanpos = xsp;
    if (jj_3R_22()) return true;
    }
    return false;
  }

  private boolean jj_3R_17()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_27()) {
    jj_scanpos = xsp;
    if (jj_3R_28()) return true;
    }
    if (jj_scan_token(NOMEVAR)) return true;
    return false;
  }

  private boolean jj_3_4()
 {
    if (jj_3R_13()) return true;
    return false;
  }

  private boolean jj_3_5()
 {
    if (jj_3R_14()) return true;
    if (jj_3R_15()) return true;
    return false;
  }

  private boolean jj_3R_33()
 {
    if (jj_3R_9()) return true;
    return false;
  }

  private boolean jj_3R_26()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_4()) {
    jj_scanpos = xsp;
    if (jj_3R_33()) return true;
    }
    return false;
  }

  private boolean jj_3R_25()
 {
    if (jj_3R_32()) return true;
    return false;
  }

  /** Generated Token Manager. */
  public CompiladorSlothTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[32];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	   jj_la1_init_2();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x7e00,0x0,0x0,0x7e00,0x3e00,0x0,0x20030000,0x20030000,0x0,0xbe00,0xbe00,0xbe00,0xbe00,0x0,0x3e00,0x0,0x3e00,0x100000,0x100000,0x20030000,0x20030000,0x0,0x20030000,0xfc00000,0xfc00000,0x0,0x30000,0x30000,0x0,0x0,0xbe00,0xbe00,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x1200000,0x20000,0x1000000,0x0,0x0,0x2000000,0xfc000200,0xfc000200,0x2000000,0x581a800,0x581a800,0x4800000,0x481a800,0x4000000,0x4000000,0x2000000,0x0,0x40,0x0,0xfc400200,0xfc000200,0x4000000,0xfc000200,0x5bf,0x0,0x5bf,0xf8000000,0x0,0x1a800,0x1000,0x581a800,0x581a800,};
	}
	private static void jj_la1_init_2() {
	   jj_la1_2 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
	}
  final private JJCalls[] jj_2_rtns = new JJCalls[5];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public CompiladorSloth(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public CompiladorSloth(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new CompiladorSlothTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 32; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 32; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public CompiladorSloth(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new CompiladorSlothTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 32; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new CompiladorSlothTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 32; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public CompiladorSloth(CompiladorSlothTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 32; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(CompiladorSlothTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 32; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   if (++jj_gc > 100) {
		 jj_gc = 0;
		 for (int i = 0; i < jj_2_rtns.length; i++) {
		   JJCalls c = jj_2_rtns[i];
		   while (c != null) {
			 if (c.gen < jj_gen) c.first = null;
			 c = c.next;
		   }
		 }
	   }
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
	 if (jj_scanpos == jj_lastpos) {
	   jj_la--;
	   if (jj_scanpos.next == null) {
		 jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
	   } else {
		 jj_lastpos = jj_scanpos = jj_scanpos.next;
	   }
	 } else {
	   jj_scanpos = jj_scanpos.next;
	 }
	 if (jj_rescan) {
	   int i = 0; Token tok = token;
	   while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
	   if (tok != null) jj_add_error_token(kind, i);
	 }
	 if (jj_scanpos.kind != kind) return true;
	 if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
	 return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
	 if (pos >= 100) {
		return;
	 }

	 if (pos == jj_endpos + 1) {
	   jj_lasttokens[jj_endpos++] = kind;
	 } else if (jj_endpos != 0) {
	   jj_expentry = new int[jj_endpos];

	   for (int i = 0; i < jj_endpos; i++) {
		 jj_expentry[i] = jj_lasttokens[i];
	   }

	   for (int[] oldentry : jj_expentries) {
		 if (oldentry.length == jj_expentry.length) {
		   boolean isMatched = true;

		   for (int i = 0; i < jj_expentry.length; i++) {
			 if (oldentry[i] != jj_expentry[i]) {
			   isMatched = false;
			   break;
			 }

		   }
		   if (isMatched) {
			 jj_expentries.add(jj_expentry);
			 break;
		   }
		 }
	   }

	   if (pos != 0) {
		 jj_lasttokens[(jj_endpos = pos) - 1] = kind;
	   }
	 }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[65];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 32; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		   if ((jj_la1_2[i] & (1<<j)) != 0) {
			 la1tokens[64+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 65; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 jj_endpos = 0;
	 jj_rescan_token();
	 jj_add_error_token(0, 0);
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private int trace_indent = 0;
  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
	 jj_rescan = true;
	 for (int i = 0; i < 5; i++) {
	   try {
		 JJCalls p = jj_2_rtns[i];

		 do {
		   if (p.gen > jj_gen) {
			 jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
			 switch (i) {
			   case 0: jj_3_1(); break;
			   case 1: jj_3_2(); break;
			   case 2: jj_3_3(); break;
			   case 3: jj_3_4(); break;
			   case 4: jj_3_5(); break;
			 }
		   }
		   p = p.next;
		 } while (p != null);

		 } catch(LookaheadSuccess ls) { }
	 }
	 jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
	 JJCalls p = jj_2_rtns[index];
	 while (p.gen > jj_gen) {
	   if (p.next == null) { p = p.next = new JJCalls(); break; }
	   p = p.next;
	 }

	 p.gen = jj_gen + xla - jj_la; 
	 p.first = token;
	 p.arg = xla;
  }

  static final class JJCalls {
	 int gen;
	 Token first;
	 int arg;
	 JJCalls next;
  }

}
