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
 * @since Available in iOS 3.0 and later.
 * @deprecated Deprecated in iOS 7.0.
 */
@Deprecated

@Library("GameKit/GameKit.h")
@Mapping("GKPeerPickerConnectionType")
public final class GKPeerPickerConnectionType extends ObjCEnum {
    
    @GlobalConstant("GKPeerPickerConnectionTypeOnline")
    public static final long Online = 1L;
    @GlobalConstant("GKPeerPickerConnectionTypeNearby")
    public static final long Nearby = 2L;
    

}
