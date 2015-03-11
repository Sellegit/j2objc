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

@Library("Photos")
@Mapping("PHAssetEditOperation")
public final class PHAssetEditOperation extends ObjCEnum {
    
    @GlobalConstant("PHAssetEditOperationDelete")
    public static final long Delete = 1L;
    @GlobalConstant("PHAssetEditOperationContent")
    public static final long Content = 2L;
    @GlobalConstant("PHAssetEditOperationProperties")
    public static final long Properties = 3L;
    

}
