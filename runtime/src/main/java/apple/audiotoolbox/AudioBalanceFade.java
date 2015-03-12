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





@Mapping("AudioBalanceFade")
public class AudioBalanceFade 
    extends Struct 
     {

    
    protected AudioBalanceFade() {}
    
    
    @DotMapping("mLeftRightBalance")
    public native float getMLeftRightBalance();
    @DotMapping("mBackFrontFade")
    public native float getMBackFrontFade();
    @DotMapping("mType")
    public native int getMType();
    @DotMapping("mChannelLayout")
    public native AudioChannelLayout getMChannelLayout();
    
    public static native AudioBalanceFade create(float mLeftRightBalance, float mBackFrontFade, int mType, AudioChannelLayout mChannelLayout) /*-[
        AudioBalanceFade __new = { .mLeftRightBalance = mLeftRightBalance, .mBackFrontFade = mBackFrontFade, .mType = mType, .mChannelLayout = mChannelLayout };
        return __new;
    ]-*/;
    public static native AudioBalanceFade copyWithmLeftRightBalance(AudioBalanceFade original, float mLeftRightBalance) /*-[
        original.mLeftRightBalance = mLeftRightBalance;
        return original;
    ]-*/;

    
    public static native AudioBalanceFade copyWithmBackFrontFade(AudioBalanceFade original, float mBackFrontFade) /*-[
        original.mBackFrontFade = mBackFrontFade;
        return original;
    ]-*/;

    
    public static native AudioBalanceFade copyWithmType(AudioBalanceFade original, int mType) /*-[
        original.mType = mType;
        return original;
    ]-*/;

    
    public static native AudioBalanceFade copyWithmChannelLayout(AudioBalanceFade original, AudioChannelLayout mChannelLayout) /*-[
        original.mChannelLayout = mChannelLayout;
        return original;
    ]-*/;

    
}
