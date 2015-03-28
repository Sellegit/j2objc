package apple.audiotoolbox;


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
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("AudioToolbox/AudioToolbox.h")
public class AudioFile 
    extends Object 
     {

    
    
    protected AudioFile() {}

    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileCreateWithURL")
    public static native AudioFileError createWithURL(CFURL inFileRef, int inFileType, AudioStreamBasicDescription inFormat, int inFlags, Todo outAudioFile);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileOpenURL")
    public static native AudioFileError openURL(CFURL inFileRef, byte inPermissions, int inFileTypeHint, Todo outAudioFile);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileInitializeWithCallbacks")
    public static native AudioFileError initializeWithCallbacks(Todo inClientData, FunctionPtr inReadFunc, FunctionPtr inWriteFunc, FunctionPtr inGetSizeFunc, FunctionPtr inSetSizeFunc, int inFileType, AudioStreamBasicDescription inFormat, int inFlags, Todo outAudioFile);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileOpenWithCallbacks")
    public static native AudioFileError openWithCallbacks(Todo inClientData, FunctionPtr inReadFunc, FunctionPtr inWriteFunc, FunctionPtr inGetSizeFunc, FunctionPtr inSetSizeFunc, int inFileTypeHint, Todo outAudioFile);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileClose")
    public static native AudioFileError closeFile(AudioFile inAudioFile);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileOptimize")
    public static native AudioFileError optimize(AudioFile inAudioFile);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileReadBytes")
    public static native AudioFileError readBytes(AudioFile inAudioFile, boolean inUseCache, long inStartingByte, Todo ioNumBytes, Todo outBuffer);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileWriteBytes")
    public static native AudioFileError writeBytes(AudioFile inAudioFile, boolean inUseCache, long inStartingByte, Todo ioNumBytes, Todo inBuffer);
    /**
     * @since Available in iOS 2.2 and later.
     */
    @GlobalFunction("AudioFileReadPacketData")
    public static native AudioFileError readPacketData(AudioFile inAudioFile, boolean inUseCache, Todo ioNumBytes, Todo outPacketDescriptions, long inStartingPacket, Todo ioNumPackets, Todo outBuffer);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @GlobalFunction("AudioFileReadPackets")
    public static native AudioFileError readPackets(AudioFile inAudioFile, boolean inUseCache, Todo outNumBytes, Todo outPacketDescriptions, long inStartingPacket, Todo ioNumPackets, Todo outBuffer);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileWritePackets")
    public static native AudioFileError writePackets(AudioFile inAudioFile, boolean inUseCache, int inNumBytes, Todo inPacketDescriptions, long inStartingPacket, Todo ioNumPackets, Todo inBuffer);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileCountUserData")
    public static native AudioFileError countUserData(AudioFile inAudioFile, int inUserDataID, Todo outNumberItems);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileGetUserDataSize")
    public static native AudioFileError getUserDataSize(AudioFile inAudioFile, int inUserDataID, int inIndex, Todo outUserDataSize);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileGetUserData")
    public static native AudioFileError getUserData(AudioFile inAudioFile, int inUserDataID, int inIndex, Todo ioUserDataSize, Todo outUserData);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileSetUserData")
    public static native AudioFileError setUserData(AudioFile inAudioFile, int inUserDataID, int inIndex, int inUserDataSize, Todo inUserData);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileRemoveUserData")
    public static native AudioFileError removeUserData(AudioFile inAudioFile, int inUserDataID, int inIndex);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileGetPropertyInfo")
    public static native AudioFileError getPropertyInfo(AudioFile inAudioFile, int inPropertyID, Todo outDataSize, Todo isWritable);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileGetProperty")
    public static native AudioFileError getProperty(AudioFile inAudioFile, int inPropertyID, Todo ioDataSize, Todo outPropertyData);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileSetProperty")
    public static native AudioFileError setProperty(AudioFile inAudioFile, int inPropertyID, int inDataSize, Todo inPropertyData);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileGetGlobalInfoSize")
    public static native AudioFileError getGlobalInfoSize(int inPropertyID, int inSpecifierSize, Todo inSpecifier, Todo outDataSize);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileGetGlobalInfo")
    public static native AudioFileError getGlobalInfo(int inPropertyID, int inSpecifierSize, Todo inSpecifier, Todo ioDataSize, Todo outPropertyData);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileStreamOpen")
    public static native AudioFileError streamOpen(Todo inClientData, FunctionPtr inPropertyListenerProc, FunctionPtr inPacketsProc, int inFileTypeHint, Todo outAudioFileStream);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileStreamParseBytes")
    public static native AudioFileError streamParseBytes(AudioFileStream inAudioFileStream, int inDataByteSize, Todo inData, int inFlags);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileStreamSeek")
    public static native AudioFileError streamSeek(AudioFileStream inAudioFileStream, long inPacketOffset, Todo outDataByteOffset, Todo ioFlags);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileStreamGetPropertyInfo")
    public static native AudioFileError streamGetPropertyInfo(AudioFileStream inAudioFileStream, int inPropertyID, Todo outPropertyDataSize, Todo outWritable);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileStreamGetProperty")
    public static native AudioFileError streamGetProperty(AudioFileStream inAudioFileStream, int inPropertyID, Todo ioPropertyDataSize, Todo outPropertyData);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileStreamSetProperty")
    public static native AudioFileError streamSetProperty(AudioFileStream inAudioFileStream, int inPropertyID, int inPropertyDataSize, Todo inPropertyData);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("AudioFileStreamClose")
    public static native AudioFileError streamClose(AudioFileStream inAudioFileStream);

}
