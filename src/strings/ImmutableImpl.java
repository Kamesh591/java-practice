package strings;

public final class ImmutableImpl {

    private int i;
    ImmutableImpl(int i){
        this.i=i;
    }

    public ImmutableImpl modify(int i){

        if (this.i==i){
            return this;
        }
        else
        {
            return new ImmutableImpl(i);
        }
    }

    public static void main(String[] args) {

        ImmutableImpl immutable= new ImmutableImpl(10);
        immutable.modify(20);
    }
}


