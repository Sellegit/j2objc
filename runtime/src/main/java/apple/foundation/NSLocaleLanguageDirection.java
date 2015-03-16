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





@Library("Foundation/Foundation.h")
@Mapping("NSLocaleLanguageDirection")
public final class NSLocaleLanguageDirection extends ObjCEnum {
    
    @GlobalConstant("NSLocaleLanguageDirectionUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("NSLocaleLanguageDirectionLeftToRight")
    public static final long LeftToRight = 1L;
    @GlobalConstant("NSLocaleLanguageDirectionRightToLeft")
    public static final long RightToLeft = 2L;
    @GlobalConstant("NSLocaleLanguageDirectionTopToBottom")
    public static final long TopToBottom = 3L;
    @GlobalConstant("NSLocaleLanguageDirectionBottomToTop")
    public static final long BottomToTop = 4L;
    

}
