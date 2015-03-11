package apple.photos;


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
import apple.corelocation.*;
import apple.uikit.*;
import apple.avfoundation.*;



/**
 * @since Available in iOS 8.0 and later.
 */


@Mapping("PHAssetBurstSelectionType")
public final class PHAssetBurstSelectionType extends ObjCEnum {
    
    @GlobalConstant("PHAssetBurstSelectionTypeNone")
    public static final long None = 0L;
    @GlobalConstant("PHAssetBurstSelectionTypeAutoPick")
    public static final long AutoPick = 1L;
    @GlobalConstant("PHAssetBurstSelectionTypeUserPick")
    public static final long UserPick = 2L;
    

}
