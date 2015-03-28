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


@Library("GameKit/GameKit.h") @Mapping("GKSavedGameListener")
public interface GKSavedGameListener 
    extends NSObjectProtocol {

    
    


    
    @Mapping("player:didModifySavedGame:")
    void didModifySavedGame(GKPlayer player, GKSavedGame savedGame);
    @Mapping("player:hasConflictingSavedGames:")
    void hasConflictingSavedGames(GKPlayer player, NSArray<?> savedGames);

    /*<adapter>*/
    /*</adapter>*/
}
