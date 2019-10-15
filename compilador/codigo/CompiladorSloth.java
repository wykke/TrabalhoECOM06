/* CompiladorSloth.java */
/* Generated By:JavaCC: Do not edit this line. CompiladorSloth.java */
public class CompiladorSloth implements CompiladorSlothConstants {
    private static Codigo cod = new Codigo();

        public static void main(String[] args) throws ParseException
        {
                try
                {
                        CompiladorSloth analizador = new CompiladorSloth(System.in) ;
                        analizador.Programa();
                        System.out.println("\n--- Compilado sem erros ---");
                }
                catch(ParseException e)
                {
                        System.out.println(e.getMessage());
                        System.out.println("Analizador: foram encontrados alguns erros na analise.");
                }
                finally{
                        System.out.println("\n--- Tokens Encontrados ---\n");
                        for(Token nome : cod.getTokenList()){
                System.out.println(
                                        "Token: " + tokenImage[nome.kind] + " -> " + nome.toString());
                }
                }
        }

  static final public void Programa() throws ParseException {Token a,b;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TIPOINT:
      case TIPODOUBLE:
      case TIPOCHAR:
      case TIPOSTRING:
      case TIPOBOOLEAN:
      case TIPOVOID:
      case IMPORT:
      case COMENT:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
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
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    Execucao();
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

  static final public void Funcao() throws ParseException {Token a,b;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TIPOVOID:{
      a = jj_consume_token(TIPOVOID);
cod.add(a);
      break;
      }
    case TIPOINT:
    case TIPODOUBLE:
    case TIPOCHAR:
    case TIPOSTRING:
    case TIPOBOOLEAN:{
      TipoVar();
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    NomeVar();
    a = jj_consume_token(ABREPAR);
cod.add(a);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TIPOINT:
    case TIPODOUBLE:
    case TIPOCHAR:
    case TIPOSTRING:
    case TIPOBOOLEAN:{
      FuncPar();
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      ;
    }
    b = jj_consume_token(FECHAPAR);
cod.add(b);
    Bloco();
}

  static final public void FuncPar() throws ParseException {Token a;
    TipoVar();
    NomeVar();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case SEPFUN:{
      a = jj_consume_token(SEPFUN);
cod.add(a);
      FuncPar();
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      ;
    }
}

  static final public void Retorno() throws ParseException {Token a;
    a = jj_consume_token(RETORNO);
cod.add(a);
    Expressao();
}

  static final public void ChamaFuncao() throws ParseException {Token a,b;
    NomeVar();
    a = jj_consume_token(ABREPAR);
cod.add(a);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TRUE:
    case FALSE:
    case STRING:
    case INTEIRO:
    case CARACTER:
    case REAL:
    case PORCENTAGEM:
    case NOMEVAR:{
      ChamaFuncPar();
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      ;
    }
    b = jj_consume_token(FECHAPAR);
cod.add(b);
}

  static final public void ChamaFuncPar() throws ParseException {Token a;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NOMEVAR:{
      NomeVar();
      break;
      }
    case TRUE:
    case FALSE:
    case STRING:
    case INTEIRO:
    case CARACTER:
    case REAL:
    case PORCENTAGEM:{
      ValorVar();
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case SEPFUN:{
      a = jj_consume_token(SEPFUN);
cod.add(a);
      ChamaFuncPar();
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      ;
    }
}

  static final public void Importacao() throws ParseException {Token a,b;
    a = jj_consume_token(IMPORT);
cod.add(a);
    b = jj_consume_token(STRING);
cod.add(b);
}

  static final public void Execucao() throws ParseException {Token a,b,c;
    a = jj_consume_token(FIRST);
cod.add(a);
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

  static final public void Linha() throws ParseException {Token a;
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

  static final public void Write() throws ParseException {Token a,b,c;
    a = jj_consume_token(WRITE);
cod.add(a);
    b = jj_consume_token(ABREPAR);
cod.add(b);
    Expressao();
    c = jj_consume_token(FECHAPAR);
cod.add(c);
}

  static final public void ManVar() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TIPOINT:
    case TIPODOUBLE:
    case TIPOCHAR:
    case TIPOSTRING:
    case TIPOBOOLEAN:{
      TipoVar();
      ChamaFuncPar();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IGUALDADE:{
        Atribuicao();
        break;
        }
      default:
        jj_la1[13] = jj_gen;
        ;
      }
      break;
      }
    case NOMEVAR:{
      if (jj_2_1(3)) {
        NomeVar();
        Atribuicao();
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case NOMEVAR:{
          ChamaFuncao();
          break;
          }
        default:
          jj_la1[14] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      break;
      }
    default:
      jj_la1[15] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void ManVarSeq() throws ParseException {Token a;
    TipoVar();
    NomeVar();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IGUALDADE:{
      Atribuicao();
      break;
      }
    default:
      jj_la1[16] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case SEPFUN:{
      a = jj_consume_token(SEPFUN);
cod.add(a);
      ChamaFuncPar();
      break;
      }
    default:
      jj_la1[17] = jj_gen;
      ;
    }
}

  static final public void TipoVar() throws ParseException {Token a=null;
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
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
cod.add(a);
}

  static final public void NomeVar() throws ParseException {Token a,b,c;
    a = jj_consume_token(NOMEVAR);
cod.add(a);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ABREVET:{
      b = jj_consume_token(ABREVET);
cod.add(b);
      Expressao();
      c = jj_consume_token(FECHAVET);
cod.add(c);
      break;
      }
    default:
      jj_la1[19] = jj_gen;
      ;
    }
}

  static final public void Atribuicao() throws ParseException {Token a;
    a = jj_consume_token(IGUALDADE);
cod.add(a);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case GET:{
      Read();
      break;
      }
    case TRUE:
    case FALSE:
    case ABREPAR:
    case NOT:
    case STRING:
    case INTEIRO:
    case CARACTER:
    case REAL:
    case PORCENTAGEM:
    case NOMEVAR:{
      Expressao();
      break;
      }
    default:
      jj_la1[20] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void Read() throws ParseException {Token a,b,c;
    a = jj_consume_token(GET);
cod.add(a);
    b = jj_consume_token(ABREPAR);
cod.add(b);
    c = jj_consume_token(FECHAPAR);
cod.add(c);
}

  static final public void Expressao() throws ParseException {Token a,b,c;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ABREPAR:{
      a = jj_consume_token(ABREPAR);
cod.add(a);
      label_4:
      while (true) {
        Expressao();
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case TRUE:
        case FALSE:
        case ABREPAR:
        case NOT:
        case STRING:
        case INTEIRO:
        case CARACTER:
        case REAL:
        case PORCENTAGEM:
        case NOMEVAR:{
          ;
          break;
          }
        default:
          jj_la1[21] = jj_gen;
          break label_4;
        }
      }
      b = jj_consume_token(FECHAPAR);
cod.add(b);
      break;
      }
    case NOT:{
      c = jj_consume_token(NOT);
cod.add(c);
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
      ValorVar();
      break;
      }
    case NOMEVAR:{
      if (jj_2_2(3)) {
        ChamaFuncao();
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case NOMEVAR:{
          NomeVar();
          break;
          }
        default:
          jj_la1[22] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      break;
      }
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    if (jj_2_3(2)) {
      Operador();
      Expressao();
    } else {
      ;
    }
}

  static final public void Operador() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ADD:
    case SUB:
    case MULT:
    case MOD:
    case DIV:
    case POW:{
      OpArit();
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
      OpRelac();
      break;
      }
    default:
      jj_la1[24] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void OpArit() throws ParseException {Token a,b,c,d,e,f;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ADD:{
      a = jj_consume_token(ADD);
cod.add(a);
      break;
      }
    case SUB:{
      b = jj_consume_token(SUB);
cod.add(b);
      break;
      }
    case MOD:{
      c = jj_consume_token(MOD);
cod.add(c);
      break;
      }
    case DIV:{
      d = jj_consume_token(DIV);
cod.add(d);
      break;
      }
    case POW:{
      e = jj_consume_token(POW);
cod.add(e);
      break;
      }
    case MULT:{
      f = jj_consume_token(MULT);
cod.add(f);
      break;
      }
    default:
      jj_la1[25] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void OpRelac() throws ParseException {Token a,b,c,d,e,f,g,h,i;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case AND:{
      a = jj_consume_token(AND);
cod.add(a);
      break;
      }
    case OR:{
      b = jj_consume_token(OR);
cod.add(b);
      break;
      }
    case XOR:{
      c = jj_consume_token(XOR);
cod.add(c);
      break;
      }
    case IGUAL:{
      d = jj_consume_token(IGUAL);
cod.add(d);
      break;
      }
    case DIF:{
      e = jj_consume_token(DIF);
cod.add(e);
      break;
      }
    case MAIGUAL:{
      f = jj_consume_token(MAIGUAL);
cod.add(f);
      break;
      }
    case MEIGUAL:{
      g = jj_consume_token(MEIGUAL);
cod.add(g);
      break;
      }
    case MAIOR:{
      h = jj_consume_token(MAIOR);
cod.add(h);
      break;
      }
    case MENOR:{
      i = jj_consume_token(MENOR);
cod.add(i);
      break;
      }
    default:
      jj_la1[26] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void ValorVar() throws ParseException {Token a,b,c,d,e;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTEIRO:{
      a = jj_consume_token(INTEIRO);
cod.add(a);
      break;
      }
    case REAL:{
      b = jj_consume_token(REAL);
cod.add(b);
      break;
      }
    case CARACTER:{
      c = jj_consume_token(CARACTER);
cod.add(c);
      break;
      }
    case TRUE:
    case FALSE:{
      Booleano();
      break;
      }
    case PORCENTAGEM:{
      d = jj_consume_token(PORCENTAGEM);
cod.add(d);
      break;
      }
    case STRING:{
      e = jj_consume_token(STRING);
cod.add(e);
      break;
      }
    default:
      jj_la1[27] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void Booleano() throws ParseException {Token a,b;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TRUE:{
      a = jj_consume_token(TRUE);
cod.add(a);
      break;
      }
    case FALSE:{
      b = jj_consume_token(FALSE);
cod.add(b);
      break;
      }
    default:
      jj_la1[28] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void FluxoDados() throws ParseException {
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
      jj_la1[29] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void While() throws ParseException {Token a,b,c;
    a = jj_consume_token(WHILE);
cod.add(a);
    b = jj_consume_token(ABREPAR);
cod.add(b);
    Expressao();
    c = jj_consume_token(FECHAPAR);
cod.add(c);
    Bloco();
}

  static final public void For() throws ParseException {Token a,b,c,d,e;
    a = jj_consume_token(FOR);
cod.add(a);
    b = jj_consume_token(ABREPAR);
cod.add(b);
    NomeVar();
    c = jj_consume_token(IGUALDADE);
cod.add(c);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TRUE:
    case FALSE:
    case STRING:
    case INTEIRO:
    case CARACTER:
    case REAL:
    case PORCENTAGEM:{
      ValorVar();
      break;
      }
    case NOMEVAR:{
      NomeVar();
      break;
      }
    default:
      jj_la1[30] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    d = jj_consume_token(SEPFOR);
cod.add(d);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TRUE:
    case FALSE:
    case STRING:
    case INTEIRO:
    case CARACTER:
    case REAL:
    case PORCENTAGEM:{
      ValorVar();
      break;
      }
    case NOMEVAR:{
      NomeVar();
      break;
      }
    default:
      jj_la1[31] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    d = jj_consume_token(SEPFOR);
cod.add(d);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TRUE:
    case FALSE:
    case STRING:
    case INTEIRO:
    case CARACTER:
    case REAL:
    case PORCENTAGEM:{
      ValorVar();
      break;
      }
    case NOMEVAR:{
      NomeVar();
      break;
      }
    default:
      jj_la1[32] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    e = jj_consume_token(FECHAPAR);
cod.add(e);
    Bloco();
}

  static final public void Foreach() throws ParseException {Token a,b,c,d;
    a = jj_consume_token(FOREACH);
cod.add(a);
    b = jj_consume_token(ABREPAR);
cod.add(b);
    NomeVar();
    c = jj_consume_token(SEPFOR);
cod.add(c);
    NomeVar();
    d = jj_consume_token(FECHAPAR);
cod.add(d);
    Bloco();
}

  static final public void If() throws ParseException {Token a,b,c,d;
    a = jj_consume_token(IF);
cod.add(a);
    b = jj_consume_token(ABREPAR);
cod.add(b);
    Expressao();
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
      jj_la1[33] = jj_gen;
      ;
    }
}

  static final public void Bloco() throws ParseException {Token a,b,c;
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
        jj_la1[34] = jj_gen;
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
        jj_la1[35] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    c = jj_consume_token(END);
cod.add(c);
}

  static private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_1()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_2()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_3()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  static private boolean jj_3R_7()
 {
    if (jj_scan_token(IGUALDADE)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_12()) {
    jj_scanpos = xsp;
    if (jj_3R_13()) return true;
    }
    return false;
  }

  static private boolean jj_3R_11()
 {
    if (jj_scan_token(ABREVET)) return true;
    if (jj_3R_10()) return true;
    return false;
  }

  static private boolean jj_3R_6()
 {
    if (jj_scan_token(NOMEVAR)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_11()) jj_scanpos = xsp;
    return false;
  }

  static private boolean jj_3R_52()
 {
    if (jj_scan_token(FALSE)) return true;
    return false;
  }

  static private boolean jj_3R_51()
 {
    if (jj_scan_token(TRUE)) return true;
    return false;
  }

  static private boolean jj_3R_50()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_51()) {
    jj_scanpos = xsp;
    if (jj_3R_52()) return true;
    }
    return false;
  }

  static private boolean jj_3R_49()
 {
    if (jj_scan_token(STRING)) return true;
    return false;
  }

  static private boolean jj_3R_48()
 {
    if (jj_scan_token(PORCENTAGEM)) return true;
    return false;
  }

  static private boolean jj_3R_47()
 {
    if (jj_3R_50()) return true;
    return false;
  }

  static private boolean jj_3R_46()
 {
    if (jj_scan_token(CARACTER)) return true;
    return false;
  }

  static private boolean jj_3R_45()
 {
    if (jj_scan_token(REAL)) return true;
    return false;
  }

  static private boolean jj_3R_44()
 {
    if (jj_scan_token(INTEIRO)) return true;
    return false;
  }

  static private boolean jj_3_1()
 {
    if (jj_3R_6()) return true;
    if (jj_3R_7()) return true;
    return false;
  }

  static private boolean jj_3R_25()
 {
    Token xsp;
    xsp = jj_scanpos;
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
    return false;
  }

  static private boolean jj_3R_43()
 {
    if (jj_scan_token(MENOR)) return true;
    return false;
  }

  static private boolean jj_3R_42()
 {
    if (jj_scan_token(MAIOR)) return true;
    return false;
  }

  static private boolean jj_3R_41()
 {
    if (jj_scan_token(MEIGUAL)) return true;
    return false;
  }

  static private boolean jj_3R_40()
 {
    if (jj_scan_token(MAIGUAL)) return true;
    return false;
  }

  static private boolean jj_3R_39()
 {
    if (jj_scan_token(DIF)) return true;
    return false;
  }

  static private boolean jj_3R_38()
 {
    if (jj_scan_token(IGUAL)) return true;
    return false;
  }

  static private boolean jj_3R_37()
 {
    if (jj_scan_token(XOR)) return true;
    return false;
  }

  static private boolean jj_3R_36()
 {
    if (jj_scan_token(OR)) return true;
    return false;
  }

  static private boolean jj_3R_24()
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
    if (jj_3R_40()) {
    jj_scanpos = xsp;
    if (jj_3R_41()) {
    jj_scanpos = xsp;
    if (jj_3R_42()) {
    jj_scanpos = xsp;
    if (jj_3R_43()) return true;
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

  static private boolean jj_3R_35()
 {
    if (jj_scan_token(AND)) return true;
    return false;
  }

  static private boolean jj_3R_34()
 {
    if (jj_scan_token(MULT)) return true;
    return false;
  }

  static private boolean jj_3R_33()
 {
    if (jj_scan_token(POW)) return true;
    return false;
  }

  static private boolean jj_3R_16()
 {
    if (jj_3R_24()) return true;
    return false;
  }

  static private boolean jj_3R_32()
 {
    if (jj_scan_token(DIV)) return true;
    return false;
  }

  static private boolean jj_3R_31()
 {
    if (jj_scan_token(MOD)) return true;
    return false;
  }

  static private boolean jj_3R_30()
 {
    if (jj_scan_token(SUB)) return true;
    return false;
  }

  static private boolean jj_3R_23()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_29()) {
    jj_scanpos = xsp;
    if (jj_3R_30()) {
    jj_scanpos = xsp;
    if (jj_3R_31()) {
    jj_scanpos = xsp;
    if (jj_3R_32()) {
    jj_scanpos = xsp;
    if (jj_3R_33()) {
    jj_scanpos = xsp;
    if (jj_3R_34()) return true;
    }
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_3R_29()
 {
    if (jj_scan_token(ADD)) return true;
    return false;
  }

  static private boolean jj_3R_13()
 {
    if (jj_3R_10()) return true;
    return false;
  }

  static private boolean jj_3R_28()
 {
    if (jj_3R_25()) return true;
    return false;
  }

  static private boolean jj_3R_15()
 {
    if (jj_3R_23()) return true;
    return false;
  }

  static private boolean jj_3R_9()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_15()) {
    jj_scanpos = xsp;
    if (jj_3R_16()) return true;
    }
    return false;
  }

  static private boolean jj_3R_12()
 {
    if (jj_3R_21()) return true;
    return false;
  }

  static private boolean jj_3_2()
 {
    if (jj_3R_8()) return true;
    return false;
  }

  static private boolean jj_3_3()
 {
    if (jj_3R_9()) return true;
    if (jj_3R_10()) return true;
    return false;
  }

  static private boolean jj_3R_26()
 {
    if (jj_3R_6()) return true;
    return false;
  }

  static private boolean jj_3R_20()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_2()) {
    jj_scanpos = xsp;
    if (jj_3R_26()) return true;
    }
    return false;
  }

  static private boolean jj_3R_19()
 {
    if (jj_3R_25()) return true;
    return false;
  }

  static private boolean jj_3R_18()
 {
    if (jj_scan_token(NOT)) return true;
    return false;
  }

  static private boolean jj_3R_27()
 {
    if (jj_3R_6()) return true;
    return false;
  }

  static private boolean jj_3R_22()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_27()) {
    jj_scanpos = xsp;
    if (jj_3R_28()) return true;
    }
    return false;
  }

  static private boolean jj_3R_17()
 {
    if (jj_scan_token(ABREPAR)) return true;
    return false;
  }

  static private boolean jj_3R_10()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_17()) {
    jj_scanpos = xsp;
    if (jj_3R_18()) {
    jj_scanpos = xsp;
    if (jj_3R_19()) {
    jj_scanpos = xsp;
    if (jj_3R_20()) return true;
    }
    }
    }
    return false;
  }

  static private boolean jj_3R_14()
 {
    if (jj_3R_22()) return true;
    return false;
  }

  static private boolean jj_3R_8()
 {
    if (jj_3R_6()) return true;
    if (jj_scan_token(ABREPAR)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_14()) jj_scanpos = xsp;
    if (jj_scan_token(FECHAPAR)) return true;
    return false;
  }

  static private boolean jj_3R_21()
 {
    if (jj_scan_token(GET)) return true;
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public CompiladorSlothTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[36];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x7e00,0x7e00,0x0,0x7e00,0x3e00,0x0,0x30000,0x30000,0x0,0xbe00,0xbe00,0xbe00,0xbe00,0x0,0x0,0x3e00,0x0,0x0,0x3e00,0x100000,0x20030000,0x20030000,0x0,0x20030000,0xfc00000,0xfc00000,0x0,0x30000,0x30000,0x0,0x30000,0x30000,0x30000,0x0,0xbe00,0xbe00,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x1200000,0x1200000,0x1000000,0x0,0x0,0x2000000,0xfc000000,0xfc000000,0x2000000,0x8181a800,0x8181a800,0x80800000,0x8081a800,0x40,0x80000000,0x80000000,0x40,0x2000000,0x0,0x0,0xfc400200,0xfc000200,0x80000000,0xfc000200,0x5bf,0x0,0x5bf,0x7c000000,0x0,0x1a800,0xfc000000,0xfc000000,0xfc000000,0x1000,0x8181a800,0x8181a800,};
	}
  static final private JJCalls[] jj_2_rtns = new JJCalls[3];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public CompiladorSloth(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public CompiladorSloth(java.io.InputStream stream, String encoding) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser.  ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new CompiladorSlothTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 36; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 36; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public CompiladorSloth(java.io.Reader stream) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new CompiladorSlothTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 36; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
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
	 for (int i = 0; i < 36; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public CompiladorSloth(CompiladorSlothTokenManager tm) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 36; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(CompiladorSlothTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 36; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
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
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
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
  static final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  static private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
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
  static public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[64];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 36; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 64; i++) {
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

  static private int trace_indent = 0;
  static private boolean trace_enabled;

/** Trace enabled. */
  static final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
	 jj_rescan = true;
	 for (int i = 0; i < 3; i++) {
	   try {
		 JJCalls p = jj_2_rtns[i];

		 do {
		   if (p.gen > jj_gen) {
			 jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
			 switch (i) {
			   case 0: jj_3_1(); break;
			   case 1: jj_3_2(); break;
			   case 2: jj_3_3(); break;
			 }
		   }
		   p = p.next;
		 } while (p != null);

		 } catch(LookaheadSuccess ls) { }
	 }
	 jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
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
