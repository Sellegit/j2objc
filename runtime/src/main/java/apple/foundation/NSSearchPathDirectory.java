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





@Library("Foundation")
@Mapping("NSSearchPathDirectory")
public final class NSSearchPathDirectory extends ObjCEnum {
    
    @GlobalConstant("NSApplicationDirectory")
    public static final long ApplicationDirectory = 1L;
    @GlobalConstant("NSDemoApplicationDirectory")
    public static final long DemoApplicationDirectory = 2L;
    @GlobalConstant("NSDeveloperApplicationDirectory")
    public static final long DeveloperApplicationDirectory = 3L;
    @GlobalConstant("NSAdminApplicationDirectory")
    public static final long AdminApplicationDirectory = 4L;
    @GlobalConstant("NSLibraryDirectory")
    public static final long LibraryDirectory = 5L;
    @GlobalConstant("NSDeveloperDirectory")
    public static final long DeveloperDirectory = 6L;
    @GlobalConstant("NSUserDirectory")
    public static final long UserDirectory = 7L;
    @GlobalConstant("NSDocumentationDirectory")
    public static final long DocumentationDirectory = 8L;
    @GlobalConstant("NSDocumentDirectory")
    public static final long DocumentDirectory = 9L;
    @GlobalConstant("NSCoreServiceDirectory")
    public static final long CoreServiceDirectory = 10L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSAutosavedInformationDirectory")
    public static final long AutosavedInformationDirectory = 11L;
    @GlobalConstant("NSDesktopDirectory")
    public static final long DesktopDirectory = 12L;
    @GlobalConstant("NSCachesDirectory")
    public static final long CachesDirectory = 13L;
    @GlobalConstant("NSApplicationSupportDirectory")
    public static final long ApplicationSupportDirectory = 14L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("NSDownloadsDirectory")
    public static final long DownloadsDirectory = 15L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSInputMethodsDirectory")
    public static final long InputMethodsDirectory = 16L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSMoviesDirectory")
    public static final long MoviesDirectory = 17L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSMusicDirectory")
    public static final long MusicDirectory = 18L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSPicturesDirectory")
    public static final long PicturesDirectory = 19L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSPrinterDescriptionDirectory")
    public static final long PrinterDescriptionDirectory = 20L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSSharedPublicDirectory")
    public static final long SharedPublicDirectory = 21L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSPreferencePanesDirectory")
    public static final long PreferencePanesDirectory = 22L;
    @GlobalConstant("NSApplicationScriptsDirectory")
    public static final long ApplicationScriptsDirectory = 23L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("NSItemReplacementDirectory")
    public static final long ItemReplacementDirectory = 99L;
    @GlobalConstant("NSAllApplicationsDirectory")
    public static final long AllApplicationsDirectory = 100L;
    @GlobalConstant("NSAllLibrariesDirectory")
    public static final long AllLibrariesDirectory = 101L;
    @GlobalConstant("NSTrashDirectory")
    public static final long TrashDirectory = 102L;
    

}
