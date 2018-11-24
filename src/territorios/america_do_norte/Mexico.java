
package territorios.america_do_norte;

import territorios.*;

public final class Mexico extends territorios {
	

	    public final static Mexico instance;
	    
	    static {
	        instance = new Mexico();
	    }

	    private Mexico() {}

	    public static Mexico getInstance() {
	        return instance;
	    }
	    
	    @Override
	    public Territorio[] getVizinhos() {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

	    @Override
	    public Territorio getTerritorio() {
	        return Mexico.getInstance();
	    }

	    @Override
	    public Tag setTag() {
	        return Tag.MEXICO;
	    }
	    
	    @Override
	    public String toString() {
	        return "México";
	    }
	    
	}

