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

@Library("UIKit") @Mapping("UIManagedDocument")
public class UIManagedDocument 
    extends UIDocument 
     {

    
    
    public UIManagedDocument() {}
    @Mapping("initWithFileURL:")
    public UIManagedDocument(NSURL url) { }
    
    
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
    protected native boolean configurePersistentStoreCoordinator(NSURL storeURL, String fileType, String configuration, NSPersistentStoreOptions storeOptions, Todo error);
    @Mapping("persistentStoreTypeForFileType:")
    public native String getPersistentStoreType(String fileType);
    @Mapping("readAdditionalContentFromURL:error:")
    protected native boolean readAdditionalContent(NSURL absoluteURL, Todo error);
    @Mapping("additionalContentForURL:error:")
    protected native Object getAdditionalContent(NSURL absoluteURL, Todo error);
    @Mapping("writeAdditionalContent:toURL:originalContentsURL:error:")
    protected native boolean writeAdditionalContent(Object content, NSURL absoluteURL, NSURL absoluteOriginalContentsURL, Todo error);
    @Mapping("persistentStoreName")
    public static native String getPersistentStoreName();
    
}
