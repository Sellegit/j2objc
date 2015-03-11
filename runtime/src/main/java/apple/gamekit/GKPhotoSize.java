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





@Library("GameKit")
@Mapping("GKPhotoSize")
public final class GKPhotoSize extends ObjCEnum {
    
    @GlobalConstant("GKPhotoSizeSmall")
    public static final long Small = 0L;
    @GlobalConstant("GKPhotoSizeNormal")
    public static final long Normal = 1L;
    

}
