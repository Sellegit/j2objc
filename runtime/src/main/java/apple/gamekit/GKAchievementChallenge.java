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

@Library("GameKit/GameKit.h") @Mapping("GKAchievementChallenge")
public class GKAchievementChallenge 
    extends GKChallenge 
     {

    
    
    @Mapping("init")
    public GKAchievementChallenge() { }
    
    
    @Mapping("achievement")
    public native GKAchievement getAchievement();
    
    
    
    
    
}
