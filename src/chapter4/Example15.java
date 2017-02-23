package chapter4;

class Pwr {
    double b;
    int e;
    double val;

    Pwr(double base, int exp) {
        this.b = base;
        this.e = exp;

        this.val = 1;
        if(exp==0) return;
        for( ; exp>0; exp--) this.val = this.val * base;
    }

    double get_pwr() {
        return this.val;
    }
}
/*

    Pwr(double b, int e) {
      this.b = b;
      this.e = e;

      val = 1;
      if(e==0) return;
      for( ; e>0; e--) val = val * b;
    }
 */