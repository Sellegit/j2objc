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



/**
 * @since Available in iOS 6.0 and later.
 */

@Library("GameKit") @Mapping("GKScoreChallenge")
public class GKScoreChallenge 
    extends GKChallenge 
     {

    
    
    public GKScoreChallenge() {}
    
    
    @Mapping("score")
    public native GKScore getScore();
    
    
    
    
    
}
