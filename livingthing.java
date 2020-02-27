public class World {

    private ArrayList<LivingThing> LivingThing

    public LivingThing findLivingThing(int id) {
        for (LivingThing thing : livingThings)
           if (thing.getId() == id) {
               return thing;
           }
     
        }
        // did not find anything so return null
        return null;
    }
}       
    
    

             
