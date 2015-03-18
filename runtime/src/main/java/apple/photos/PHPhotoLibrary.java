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

@Library("Photos/Photos.h") @Mapping("PHPhotoLibrary")
public class PHPhotoLibrary 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public PHPhotoLibrary() { }
    
    
    
    
    
    
    @Mapping("performChanges:completionHandler:")
    public native void performChanges(@Block Runnable changeBlock, @Block VoidBlock2<Boolean, NSError> completionHandler);
    @Mapping("performChangesAndWait:error:")
    public native boolean performChangesAndWait(@Block Runnable changeBlock, Todo error);
    @Mapping("registerChangeObserver:")
    public native void registerChangeObserver(PHPhotoLibraryChangeObserver observer);
    @Mapping("unregisterChangeObserver:")
    public native void unregisterChangeObserver(PHPhotoLibraryChangeObserver observer);
    @Mapping("sharedPhotoLibrary")
    public static native PHPhotoLibrary getSharedPhotoLibrary();
    @Mapping("authorizationStatus")
    public static native @Representing("PHAuthorizationStatus") @MachineSizedSInt long getAuthorizationStatus();
    @Mapping("requestAuthorization:")
    public static native void requestAuthorization(@Block VoidBlock1<PHAuthorizationStatus> handler);
    
}
