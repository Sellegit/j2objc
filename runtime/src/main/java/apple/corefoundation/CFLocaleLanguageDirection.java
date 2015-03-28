package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFLocaleLanguageDirection")
public final class CFLocaleLanguageDirection extends ObjCEnum {
    
    @GlobalConstant("kCFLocaleLanguageDirectionUnknown")
    public static final long Unknown = 0L;
    @GlobalConstant("kCFLocaleLanguageDirectionLeftToRight")
    public static final long LeftToRight = 1L;
    @GlobalConstant("kCFLocaleLanguageDirectionRightToLeft")
    public static final long RightToLeft = 2L;
    @GlobalConstant("kCFLocaleLanguageDirectionTopToBottom")
    public static final long TopToBottom = 3L;
    @GlobalConstant("kCFLocaleLanguageDirectionBottomToTop")
    public static final long BottomToTop = 4L;


}
