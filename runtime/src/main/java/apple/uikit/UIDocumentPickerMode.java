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
 * @since Available in iOS 8.0 and later.
 */

@Library("UIKit/UIKit.h")
@Mapping("UIDocumentPickerMode")
public final class UIDocumentPickerMode extends ObjCEnum {
    
    @GlobalConstant("UIDocumentPickerModeImport")
    public static final long Import = 0L;
    @GlobalConstant("UIDocumentPickerModeOpen")
    public static final long Open = 1L;
    @GlobalConstant("UIDocumentPickerModeExportToService")
    public static final long ExportToService = 2L;
    @GlobalConstant("UIDocumentPickerModeMoveToService")
    public static final long MoveToService = 3L;
    

}
