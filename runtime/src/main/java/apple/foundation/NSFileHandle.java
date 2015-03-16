package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Library("Foundation/Foundation.h") @Mapping("NSFileHandle")
public class NSFileHandle 
    extends NSObject 
     {

    
    
    public NSFileHandle() {}
    @Mapping("initWithFileDescriptor:closeOnDealloc:")
    public NSFileHandle(int fd, boolean closeopt) { }
    @Mapping("initWithCoder:")
    public NSFileHandle(NSCoder coder) { }
    @Mapping("initWithFileDescriptor:")
    public NSFileHandle(int fd) { }
    
    
    @Mapping("availableData")
    public native NSData getAvailableData();
    @Mapping("offsetInFile")
    public native long getOffsetInFile();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("readabilityHandler")
    public native @Block VoidBlock1<NSFileHandle> getReadabilityHandler();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setReadabilityHandler:")
    public native void setReadabilityHandler(@Block VoidBlock1<NSFileHandle> v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("writeabilityHandler")
    public native @Block VoidBlock1<NSFileHandle> getWriteabilityHandler();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setWriteabilityHandler:")
    public native void setWriteabilityHandler(@Block VoidBlock1<NSFileHandle> v);
    @Mapping("fileDescriptor")
    public native int getFileDescriptor();
    
    
    
    @GlobalConstant("NSFileHandleReadCompletionNotification")
    public static native NSString ReadCompletionNotification();
    @GlobalConstant("NSFileHandleReadToEndOfFileCompletionNotification")
    public static native NSString ReadToEndOfFileCompletionNotification();
    @GlobalConstant("NSFileHandleConnectionAcceptedNotification")
    public static native NSString ConnectionAcceptedNotification();
    @GlobalConstant("NSFileHandleDataAvailableNotification")
    public static native NSString DataAvailableNotification();
    @GlobalConstant("NSFileHandleNotificationDataItem")
    protected static native NSString NotificationDataItem();
    @GlobalConstant("NSFileHandleNotificationFileHandleItem")
    protected static native NSString NotificationFileHandleItem();
    
    @Mapping("readDataToEndOfFile")
    public native NSData readDataToEndOfFile();
    @Mapping("readDataOfLength:")
    public native NSData readData(@MachineSizedUInt long length);
    @Mapping("writeData:")
    public native void writeData(NSData data);
    @Mapping("seekToEndOfFile")
    public native long seekToEndOfFile();
    @Mapping("seekToFileOffset:")
    public native void seekToFileOffset(long offset);
    @Mapping("truncateFileAtOffset:")
    public native void truncateFile(long offset);
    @Mapping("synchronizeFile")
    public native void synchronizeFile();
    @Mapping("closeFile")
    public native void closeFile();
    @Mapping("fileHandleWithStandardInput")
    public static native NSFileHandle getStandardInput();
    @Mapping("fileHandleWithStandardOutput")
    public static native NSFileHandle getStandardOutput();
    @Mapping("fileHandleWithStandardError")
    public static native NSFileHandle getStandardError();
    @Mapping("fileHandleWithNullDevice")
    public static native NSFileHandle getNullDevice();
    @Mapping("fileHandleForReadingAtPath:")
    public static native NSFileHandle createForReading(String path);
    @Mapping("fileHandleForWritingAtPath:")
    public static native NSFileHandle createForWriting(String path);
    @Mapping("fileHandleForUpdatingAtPath:")
    public static native NSFileHandle createForUpdating(String path);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("fileHandleForReadingFromURL:error:")
    protected static native NSFileHandle createForReading(NSURL url, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("fileHandleForWritingToURL:error:")
    protected static native NSFileHandle createForWriting(NSURL url, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("fileHandleForUpdatingURL:error:")
    protected static native NSFileHandle createForUpdating(NSURL url, Todo error);
    @Mapping("readInBackgroundAndNotifyForModes:")
    public native void readInBackgroundAndNotify(NSArray<?> modes);
    @Mapping("readInBackgroundAndNotify")
    public native void readInBackgroundAndNotify();
    @Mapping("readToEndOfFileInBackgroundAndNotifyForModes:")
    public native void readToEndOfFileInBackgroundAndNotify(NSArray<?> modes);
    @Mapping("readToEndOfFileInBackgroundAndNotify")
    public native void readToEndOfFileInBackgroundAndNotify();
    @Mapping("acceptConnectionInBackgroundAndNotifyForModes:")
    public native void acceptConnectionInBackgroundAndNotify(NSArray<?> modes);
    @Mapping("acceptConnectionInBackgroundAndNotify")
    public native void acceptConnectionInBackgroundAndNotify();
    @Mapping("waitForDataInBackgroundAndNotifyForModes:")
    public native void waitForDataInBackgroundAndNotify(NSArray<?> modes);
    @Mapping("waitForDataInBackgroundAndNotify")
    public native void waitForDataInBackgroundAndNotify();
    
}
