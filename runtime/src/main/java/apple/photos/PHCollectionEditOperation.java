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

@Library("Photos/Photos.h")
@Mapping("PHCollectionEditOperation")
public final class PHCollectionEditOperation extends ObjCEnum {
    
    @GlobalConstant("PHCollectionEditOperationDeleteContent")
    public static final long DeleteContent = 1L;
    @GlobalConstant("PHCollectionEditOperationRemoveContent")
    public static final long RemoveContent = 2L;
    @GlobalConstant("PHCollectionEditOperationAddContent")
    public static final long AddContent = 3L;
    @GlobalConstant("PHCollectionEditOperationCreateContent")
    public static final long CreateContent = 4L;
    @GlobalConstant("PHCollectionEditOperationRearrangeContent")
    public static final long RearrangeContent = 5L;
    @GlobalConstant("PHCollectionEditOperationDelete")
    public static final long Delete = 6L;
    @GlobalConstant("PHCollectionEditOperationRename")
    public static final long Rename = 7L;
    

}
