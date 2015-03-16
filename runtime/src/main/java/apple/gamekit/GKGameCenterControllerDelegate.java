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





@Library("GameKit/GameKit.h") @Mapping("GKGameCenterControllerDelegate")
public interface GKGameCenterControllerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("gameCenterViewControllerDidFinish:")
    void didFinish(GKGameCenterViewController gameCenterViewController);
    
    /*<adapter>*/
    /*</adapter>*/
}
