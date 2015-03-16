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





@Library("UIKit/UIKit.h")
@Mapping("UIDocumentSaveOperation")
public final class UIDocumentSaveOperation extends ObjCEnum {
    
    @GlobalConstant("UIDocumentSaveForCreating")
    public static final long Creating = 0L;
    @GlobalConstant("UIDocumentSaveForOverwriting")
    public static final long Overwriting = 1L;
    

}
