package apple.mobilecoreservices;


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

/*<javadoc>*/
/*</javadoc>*/
@Library("MobileCoreServices/MobileCoreServices.h")
public class UTType 
    extends Object 
     {

    
    
    
    
    
    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class AbstractBase {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeItem")
        public static native CFString Item();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeContent")
        public static native CFString Content();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeCompositeContent")
        public static native CFString CompositeContent();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeMessage")
        public static native CFString Message();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeContact")
        public static native CFString Contact();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeArchive")
        public static native CFString Archive();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeDiskImage")
        public static native CFString DiskImage();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class ConcreteBase {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeData")
        public static native CFString Data();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeDirectory")
        public static native CFString Directory();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeResolvable")
        public static native CFString Resolvable();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeSymLink")
        public static native CFString SymLink();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeExecutable")
        public static native CFString Executable();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeMountPoint")
        public static native CFString MountPoint();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeAliasFile")
        public static native CFString AliasFile();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeAliasRecord")
        public static native CFString AliasRecord();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeURLBookmarkData")
        public static native CFString URLBookmarkData();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class URL {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeURL")
        public static native CFString URL();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeFileURL")
        public static native CFString FileURL();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class Text {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeText")
        public static native CFString Text();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypePlainText")
        public static native CFString PlainText();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeUTF8PlainText")
        public static native CFString UTF8PlainText();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeUTF16ExternalPlainText")
        public static native CFString UTF16ExternalPlainText();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeUTF16PlainText")
        public static native CFString UTF16PlainText();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeDelimitedText")
        public static native CFString DelimitedText();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeCommaSeparatedText")
        public static native CFString CommaSeparatedText();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeTabSeparatedText")
        public static native CFString TabSeparatedText();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeUTF8TabSeparatedText")
        public static native CFString UTF8TabSeparatedText();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeRTF")
        public static native CFString RTF();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class MarkupLanguage {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeHTML")
        public static native CFString HTML();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeXML")
        public static native CFString XML();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class ProgrammingLanguage {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeSourceCode")
        public static native CFString SourceCode();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeAssemblyLanguageSource")
        public static native CFString AssemblyLanguageSource();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeCSource")
        public static native CFString CSource();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeObjectiveCSource")
        public static native CFString ObjectiveCSource();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeCPlusPlusSource")
        public static native CFString CPlusPlusSource();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeObjectiveCPlusPlusSource")
        public static native CFString ObjectiveCPlusPlusSource();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeCHeader")
        public static native CFString CHeader();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeCPlusPlusHeader")
        public static native CFString CPlusPlusHeader();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeJavaSource")
        public static native CFString JavaSource();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class ScriptingLanguage {

        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeScript")
        public static native CFString Script();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeAppleScript")
        public static native CFString AppleScript();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeOSAScript")
        public static native CFString OSAScript();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeOSAScriptBundle")
        public static native CFString OSAScriptBundle();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeJavaScript")
        public static native CFString JavaScript();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeShellScript")
        public static native CFString ShellScript();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypePerlScript")
        public static native CFString PerlScript();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypePythonScript")
        public static native CFString PythonScript();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeRubyScript")
        public static native CFString RubyScript();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypePHPScript")
        public static native CFString PHPScript();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class SerializedData {

        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeJSON")
        public static native CFString JSON();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypePropertyList")
        public static native CFString PropertyList();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeXMLPropertyList")
        public static native CFString XMLPropertyList();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeBinaryPropertyList")
        public static native CFString BinaryPropertyList();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class CompositeContent {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypePDF")
        public static native CFString PDF();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeRTFD")
        public static native CFString RTFD();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeFlatRTFD")
        public static native CFString FlatRTFD();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeTXNTextAndMultimediaData")
        public static native CFString TXNTextAndMultimediaData();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeWebArchive")
        public static native CFString WebArchive();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class ImageContent {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeImage")
        public static native CFString Image();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeJPEG")
        public static native CFString JPEG();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeJPEG2000")
        public static native CFString JPEG2000();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeTIFF")
        public static native CFString TIFF();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypePICT")
        public static native CFString PICT();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeGIF")
        public static native CFString GIF();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypePNG")
        public static native CFString PNG();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeQuickTimeImage")
        public static native CFString QuickTimeImage();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeAppleICNS")
        public static native CFString AppleICNS();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeBMP")
        public static native CFString BMP();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeICO")
        public static native CFString ICO();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeRawImage")
        public static native CFString RawImage();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeScalableVectorGraphics")
        public static native CFString ScalableVectorGraphics();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class AudiovisualContent {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeAudiovisualContent")
        public static native CFString AudiovisualContent();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeMovie")
        public static native CFString Movie();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeVideo")
        public static native CFString Video();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeAudio")
        public static native CFString Audio();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeQuickTimeMovie")
        public static native CFString QuickTimeMovie();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeMPEG")
        public static native CFString MPEG();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeMPEG2Video")
        public static native CFString MPEG2Video();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeMPEG2TransportStream")
        public static native CFString MPEG2TransportStream();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeMP3")
        public static native CFString MP3();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeMPEG4")
        public static native CFString MPEG4();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeMPEG4Audio")
        public static native CFString MPEG4Audio();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeAppleProtectedMPEG4Audio")
        public static native CFString AppleProtectedMPEG4Audio();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeAppleProtectedMPEG4Video")
        public static native CFString AppleProtectedMPEG4Video();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeAVIMovie")
        public static native CFString AVIMovie();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeAudioInterchangeFileFormat")
        public static native CFString AudioInterchangeFileFormat();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeWaveformAudio")
        public static native CFString WaveformAudio();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeMIDIAudio")
        public static native CFString MIDIAudio();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypePlaylist")
        public static native CFString Playlist();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeM3UPlaylist")
        public static native CFString M3UPlaylist();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class Directory {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeFolder")
        public static native CFString Folder();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeVolume")
        public static native CFString Volume();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypePackage")
        public static native CFString Package();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeBundle")
        public static native CFString Bundle();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypePluginBundle")
        public static native CFString PluginBundle();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeSpotlightImporter")
        public static native CFString SpotlightImporter();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeQuickLookGenerator")
        public static native CFString QuickLookGenerator();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeXPCService")
        public static native CFString XPCService();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeFramework")
        public static native CFString Framework();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class ApplicationAndExecutable {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeApplication")
        public static native CFString Application();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeApplicationBundle")
        public static native CFString ApplicationBundle();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeApplicationFile")
        public static native CFString ApplicationFile();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeUnixExecutable")
        public static native CFString UnixExecutable();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeWindowsExecutable")
        public static native CFString WindowsExecutable();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeJavaClass")
        public static native CFString JavaClass();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeJavaArchive")
        public static native CFString JavaArchive();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeSystemPreferencesPane")
        public static native CFString SystemPreferencesPane();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class Archive {

        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeGNUZipArchive")
        public static native CFString GNUZipArchive();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeBzip2Archive")
        public static native CFString Bzip2Archive();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeZipArchive")
        public static native CFString ZipArchive();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class Document {

        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeSpreadsheet")
        public static native CFString Spreadsheet();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypePresentation")
        public static native CFString Presentation();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeDatabase")
        public static native CFString Database();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class Contact {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeVCard")
        public static native CFString VCard();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeToDoItem")
        public static native CFString ToDoItem();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeCalendarEvent")
        public static native CFString CalendarEvent();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeEmailMessage")
        public static native CFString EmailMessage();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class Internet {

        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeInternetLocation")
        public static native CFString InternetLocation();
    }

    @Library("MobileCoreServices/MobileCoreServices.h")
    public static class Miscellaneous {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeInkText")
        public static native CFString InkText();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeFont")
        public static native CFString Font();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeBookmark")
        public static native CFString Bookmark();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTType3DContent")
        public static native CFString _3DContent();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypePKCS12")
        public static native CFString PKCS12();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeX509Certificate")
        public static native CFString X509Certificate();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeElectronicPublication")
        public static native CFString ElectronicPublication();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeLog")
        public static native CFString Log();
    }

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("UTTypeCreatePreferredIdentifierForTag")
    public static native CFString createPreferredIdentifierForTag(CFString inTagClass, CFString inTag, CFString inConformingToUTI);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("UTTypeCreateAllIdentifiersForTag")
    public static native List<String> createAllIdentifiersForTag(CFString inTagClass, CFString inTag, CFString inConformingToUTI);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("UTTypeCopyPreferredTagWithClass")
    public static native CFString getPreferredTagWithClass(CFString inUTI, CFString inTagClass);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("UTTypeCopyAllTagsWithClass")
    public static native List<String> getAllTagsWithClass(CFString inUTI, CFString inTagClass);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("UTTypeEqual")
    public static native boolean typeEqualsTo(CFString inUTI1, CFString inUTI2);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("UTTypeConformsTo")
    public static native boolean typeConformsTo(CFString inUTI, CFString inConformsToUTI);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("UTTypeCopyDescription")
    public static native CFString getDescriptionForType(CFString inUTI);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("UTTypeIsDeclared")
    public static native boolean typeIsDeclared(CFString inUTI);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("UTTypeIsDynamic")
    public static native boolean typeIsDynamic(CFString inUTI);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("UTTypeCopyDeclaration")
    public static native UTTypeDeclaration getDeclarationForType(CFString inUTI);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("UTTypeCopyDeclaringBundleURL")
    public static native CFURL getDeclaringBundleURLForType(CFString inUTI);

}
