package graph.upload.storage;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

/**
 * ControllerからStorageにアクセスするためのインターフェース
 *
 */
public interface StorageService {

    /**
     * Storageの初期化を行います。
     */
    void init();
    
    /**
     * uploadfileをStorageに保存します。
     * @param uploadfile
     */
    void store(MultipartFile uploadfile);
    
    /**
     * Storageに保存されいている全てのファイルパスをStreamとして返す。
     * @return
     */
    Stream<Path> loadAll();
    
    /**
     * 指定したfilenameのパスを返す。
     * @param filename
     * @return Path
     */
    Path load(String filename);

    /**
     * 指定したfilenameのResourceを返す。
     * @param filename
     * @return Resource
     */
    Resource loadAsResource(String filename);
    
    /**
     * Storageを全て削除する。
     */
    void deleteAll();
}
