package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIManagedDocument")
public class UIManagedDocument 
    extends UIDocument 
     {

    
    
    @Mapping("initWithFileURL:")
    public UIManagedDocument(NSURL url) { }
    @Mapping("init")
    public UIManagedDocument() { }
    
    
    @Mapping("managedObjectContext")
    public native NSManagedObjectContext getManagedObjectContext();
    @Mapping("managedObjectModel")
    public native NSManagedObjectModel getManagedObjectModel();
    @Mapping("persistentStoreOptions")
    public native NSPersistentStoreOptions getPersistentStoreOptions();
    @Mapping("setPersistentStoreOptions:")
    public native void setPersistentStoreOptions(NSPersistentStoreOptions v);
    @Mapping("modelConfiguration")
    public native String getModelConfiguration();
    @Mapping("setModelConfiguration:")
    public native void setModelConfiguration(String v);
    
    
    
    @Mapping("configurePersistentStoreCoordinatorForURL:ofType:modelConfiguration:storeOptions:error:")
    public native boolean configurePersistentStoreCoordinator(NSURL storeURL, String fileType, String configuration, NSDictionary<?, ?> storeOptions, Todo error);
    @Mapping("persistentStoreTypeForFileType:")
    public native String getPersistentStoreType(String fileType);
    @Mapping("readAdditionalContentFromURL:error:")
    public native boolean readAdditionalContent(NSURL absoluteURL, Todo error);
    @Mapping("additionalContentForURL:error:")
    public native Object getAdditionalContent(NSURL absoluteURL, Todo error);
    @Mapping("writeAdditionalContent:toURL:originalContentsURL:error:")
    public native boolean writeAdditionalContent(Object content, NSURL absoluteURL, NSURL absoluteOriginalContentsURL, Todo error);
    @Mapping("persistentStoreName")
    public static native String getPersistentStoreName();
    
}
