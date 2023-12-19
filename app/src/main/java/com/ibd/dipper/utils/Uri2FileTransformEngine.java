package com.ibd.dipper.utils;

import android.content.Context;

import com.luck.picture.lib.engine.UriToFileTransformEngine;
import com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener;
import com.luck.picture.lib.utils.SandboxTransformUtils;

/**
 * Uri2FileTransformEngine
 *
 * @author Jierain
 * @since 2023-08-23
 */
public class Uri2FileTransformEngine implements UriToFileTransformEngine {
    @Override
    public void onUriToFileAsyncTransform(Context context, String srcPath, String mineType, OnKeyValueResultCallbackListener call) {
        String sandboxPath = SandboxTransformUtils.copyPathToSandbox(context, srcPath, mineType);
        call.onCallback(srcPath,sandboxPath);
    }
}
