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

@Library("Photos/Photos.h") @Mapping("PHObjectChangeDetails")
public class PHObjectChangeDetails 
    extends NSObject 
     {

    
    
    public PHObjectChangeDetails() {}
    
    
    @Mapping("objectBeforeChanges")
    public native PHObject getObjectBeforeChanges();
    @Mapping("objectAfterChanges")
    public native PHObject getObjectAfterChanges();
    @Mapping("assetContentChanged")
    public native boolean assetContentChanged();
    @Mapping("objectWasDeleted")
    public native boolean objectWasDeleted();
    
    
    
    
    
}
