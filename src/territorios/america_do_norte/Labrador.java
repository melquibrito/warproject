
	package territorios.america_do_norte;

	import territorios.*;

	public final class Labrador extends territorios {
		

		    public final static Labrador instance;
		    
		    static {
		        instance = new Labrador();
		    }

		    private Labrador() {}

		    public static Labrador getInstance() {
		        return instance;
		    }
		    
		    @Override
		    public Territorio[] getVizinhos() {
		        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
		    }

		    @Override
		    public Territorio getTerritorio() {
		        return Labrador.getInstance();
		    }

		    @Override
		    public Tag setTag() {
		        return Tag.LABRADOR;
		    }
		    
		    @Override
		    public String toString() {
		        return "Labrador";
		    }
		    
		}




