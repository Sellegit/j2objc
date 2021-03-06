package apple.gamekit;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.uikit.*;

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class GKSavedGameListenerAdapter 
    extends Object 
    implements GKSavedGameListener {

    
    
    


    
    
    @NotImplemented("player:didModifySavedGame:")
    public void didModifySavedGame(GKPlayer player, GKSavedGame savedGame) { throw new UnsupportedOperationException(); }
    @NotImplemented("player:hasConflictingSavedGames:")
    public void hasConflictingSavedGames(GKPlayer player, NSArray<?> savedGames) { throw new UnsupportedOperationException(); }

}
