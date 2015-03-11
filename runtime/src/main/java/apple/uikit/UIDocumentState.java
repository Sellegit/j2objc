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






@Mapping("UIDocumentState")
public final class UIDocumentState extends ObjCEnum {
    
    @GlobalConstant("UIDocumentStateNormal")
    public static final long Normal = 0L;
    @GlobalConstant("UIDocumentStateClosed")
    public static final long Closed = 1L;
    @GlobalConstant("UIDocumentStateInConflict")
    public static final long InConflict = 2L;
    @GlobalConstant("UIDocumentStateSavingError")
    public static final long SavingError = 4L;
    @GlobalConstant("UIDocumentStateEditingDisabled")
    public static final long EditingDisabled = 8L;
    

}
