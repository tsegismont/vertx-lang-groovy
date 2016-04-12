/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.groovy.core.file;
import groovy.transform.CompileStatic
import io.vertx.lang.groovy.InternalHelper
import io.vertx.core.json.JsonObject
import java.util.List
import io.vertx.groovy.core.buffer.Buffer
import io.vertx.core.file.OpenOptions
import io.vertx.core.AsyncResult
import io.vertx.core.Handler
/**
 * Contains a broad set of operations for manipulating files on the file system.
 * <p>
 * A (potential) blocking and non blocking version of each operation is provided.
 * <p>
 * The non blocking versions take a handler which is called when the operation completes or an error occurs.
 * <p>
 * The blocking versions are named <code>xxxBlocking</code> and return the results, or throw exceptions directly.
 * In many cases, depending on the operating system and file system some of the potentially blocking operations
 * can return quickly, which is why we provide them, but it's highly recommended that you test how long they take to
 * return in your particular application before using them on an event loop.
 * <p>
 * Please consult the documentation for more information on file system support.
*/
@CompileStatic
public class FileSystem {
  private final def io.vertx.core.file.FileSystem delegate;
  public FileSystem(Object delegate) {
    this.delegate = (io.vertx.core.file.FileSystem) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * Copy a file from the path <code>from</code> to path <code>to</code>, asynchronously.
   * <p>
   * The copy will fail if the destination already exists.
   * @param from the path to copy from
   * @param to the path to copy to
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem copy(String from, String to, Handler<AsyncResult<Void>> handler) {
    this.delegate.copy(from != null ? from : null, to != null ? to : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#copy}
   * @param from 
   * @param to 
   * @return 
   */
  public FileSystem copyBlocking(String from, String to) {
    this.delegate.copyBlocking(from != null ? from : null, to != null ? to : null);
    return this;
  }
  /**
   * Copy a file from the path <code>from</code> to path <code>to</code>, asynchronously.
   * <p>
   * If <code>recursive</code> is <code>true</code> and <code>from</code> represents a directory, then the directory and its contents
   * will be copied recursively to the destination <code>to</code>.
   * <p>
   * The copy will fail if the destination if the destination already exists.
   * @param from the path to copy from
   * @param to the path to copy to
   * @param recursive 
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem copyRecursive(String from, String to, boolean recursive, Handler<AsyncResult<Void>> handler) {
    this.delegate.copyRecursive(from != null ? from : null, to != null ? to : null, recursive != null ? recursive : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#copyRecursive}
   * @param from 
   * @param to 
   * @param recursive 
   * @return 
   */
  public FileSystem copyRecursiveBlocking(String from, String to, boolean recursive) {
    this.delegate.copyRecursiveBlocking(from != null ? from : null, to != null ? to : null, recursive != null ? recursive : null);
    return this;
  }
  /**
   * Move a file from the path <code>from</code> to path <code>to</code>, asynchronously.
   * <p>
   * The move will fail if the destination already exists.
   * @param from the path to copy from
   * @param to the path to copy to
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem move(String from, String to, Handler<AsyncResult<Void>> handler) {
    this.delegate.move(from != null ? from : null, to != null ? to : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#move}
   * @param from 
   * @param to 
   * @return 
   */
  public FileSystem moveBlocking(String from, String to) {
    this.delegate.moveBlocking(from != null ? from : null, to != null ? to : null);
    return this;
  }
  /**
   * Truncate the file represented by <code>path</code> to length <code>len</code> in bytes, asynchronously.
   * <p>
   * The operation will fail if the file does not exist or <code>len</code> is less than <code>zero</code>.
   * @param path the path to the file
   * @param len the length to truncate it to
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem truncate(String path, long len, Handler<AsyncResult<Void>> handler) {
    this.delegate.truncate(path != null ? path : null, len != null ? len : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#truncate}
   * @param path 
   * @param len 
   * @return 
   */
  public FileSystem truncateBlocking(String path, long len) {
    this.delegate.truncateBlocking(path != null ? path : null, len != null ? len : null);
    return this;
  }
  /**
   * Change the permissions on the file represented by <code>path</code> to <code>perms</code>, asynchronously.
   * <p>
   * The permission String takes the form rwxr-x--- as
   * specified <a href="http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html">here</a>.
   * @param path the path to the file
   * @param perms the permissions string
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem chmod(String path, String perms, Handler<AsyncResult<Void>> handler) {
    this.delegate.chmod(path != null ? path : null, perms != null ? perms : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem #chmod(String, String, Handler)}
   * @param path 
   * @param perms 
   * @return 
   */
  public FileSystem chmodBlocking(String path, String perms) {
    this.delegate.chmodBlocking(path != null ? path : null, perms != null ? perms : null);
    return this;
  }
  /**
   * Change the permissions on the file represented by <code>path</code> to <code>perms</code>, asynchronously.<p>
   * The permission String takes the form rwxr-x--- as
   * specified in {<a href="http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html">here</a>}.
   * <p>
   * If the file is directory then all contents will also have their permissions changed recursively. Any directory permissions will
   * be set to <code>dirPerms</code>, whilst any normal file permissions will be set to <code>perms</code>.
   * @param path the path to the file
   * @param perms the permissions string
   * @param dirPerms the directory permissions
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem chmodRecursive(String path, String perms, String dirPerms, Handler<AsyncResult<Void>> handler) {
    this.delegate.chmodRecursive(path != null ? path : null, perms != null ? perms : null, dirPerms != null ? dirPerms : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#chmodRecursive}
   * @param path 
   * @param perms 
   * @param dirPerms 
   * @return 
   */
  public FileSystem chmodRecursiveBlocking(String path, String perms, String dirPerms) {
    this.delegate.chmodRecursiveBlocking(path != null ? path : null, perms != null ? perms : null, dirPerms != null ? dirPerms : null);
    return this;
  }
  /**
   * Change the ownership on the file represented by <code>path</code> to <code>user</code> and {code group}, asynchronously.
   * @param path the path to the file
   * @param user the user name, <code>null</code> will not change the user name
   * @param group the user group, <code>null</code> will not change the user group name
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem chown(String path, String user, String group, Handler<AsyncResult<Void>> handler) {
    this.delegate.chown(path != null ? path : null, user != null ? user : null, group != null ? group : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of 
   *
   * @param path 
   * @param user 
   * @param group 
   * @return 
   */
  public FileSystem chownBlocking(String path, String user, String group) {
    this.delegate.chownBlocking(path != null ? path : null, user != null ? user : null, group != null ? group : null);
    return this;
  }
  /**
   * Obtain properties for the file represented by <code>path</code>, asynchronously.
   * <p>
   * If the file is a link, the link will be followed.
   * @param path the path to the file
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem props(String path, Handler<AsyncResult<FileProps>> handler) {
    this.delegate.props(path != null ? path : null, handler != null ? new Handler<AsyncResult<io.vertx.core.file.FileProps>>(){
    public void handle(AsyncResult<io.vertx.core.file.FileProps> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#props}
   * @param path 
   * @return 
   */
  public FileProps propsBlocking(String path) {
    def ret= InternalHelper.safeCreate(this.delegate.propsBlocking(path != null ? path : null), io.vertx.groovy.core.file.FileProps.class);
    return ret;
  }
  /**
   * Obtain properties for the link represented by <code>path</code>, asynchronously.
   * <p>
   * The link will not be followed.
   * @param path the path to the file
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem lprops(String path, Handler<AsyncResult<FileProps>> handler) {
    this.delegate.lprops(path != null ? path : null, handler != null ? new Handler<AsyncResult<io.vertx.core.file.FileProps>>(){
    public void handle(AsyncResult<io.vertx.core.file.FileProps> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#lprops}
   * @param path 
   * @return 
   */
  public FileProps lpropsBlocking(String path) {
    def ret= InternalHelper.safeCreate(this.delegate.lpropsBlocking(path != null ? path : null), io.vertx.groovy.core.file.FileProps.class);
    return ret;
  }
  /**
   * Create a hard link on the file system from <code>link</code> to <code>existing</code>, asynchronously.
   * @param link the link
   * @param existing the link destination
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem link(String link, String existing, Handler<AsyncResult<Void>> handler) {
    this.delegate.link(link != null ? link : null, existing != null ? existing : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#link}
   * @param link 
   * @param existing 
   * @return 
   */
  public FileSystem linkBlocking(String link, String existing) {
    this.delegate.linkBlocking(link != null ? link : null, existing != null ? existing : null);
    return this;
  }
  /**
   * Create a symbolic link on the file system from <code>link</code> to <code>existing</code>, asynchronously.
   * @param link the link
   * @param existing the link destination
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem symlink(String link, String existing, Handler<AsyncResult<Void>> handler) {
    this.delegate.symlink(link != null ? link : null, existing != null ? existing : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#link}
   * @param link 
   * @param existing 
   * @return 
   */
  public FileSystem symlinkBlocking(String link, String existing) {
    this.delegate.symlinkBlocking(link != null ? link : null, existing != null ? existing : null);
    return this;
  }
  /**
   * Unlinks the link on the file system represented by the path <code>link</code>, asynchronously.
   * @param link the link
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem unlink(String link, Handler<AsyncResult<Void>> handler) {
    this.delegate.unlink(link != null ? link : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#unlink}
   * @param link 
   * @return 
   */
  public FileSystem unlinkBlocking(String link) {
    this.delegate.unlinkBlocking(link != null ? link : null);
    return this;
  }
  /**
   * Returns the path representing the file that the symbolic link specified by <code>link</code> points to, asynchronously.
   * @param link the link
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem readSymlink(String link, Handler<AsyncResult<String>> handler) {
    this.delegate.readSymlink(link != null ? link : null, handler != null ? new Handler<AsyncResult<java.lang.String>>(){
    public void handle(AsyncResult<java.lang.String> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#readSymlink}
   * @param link 
   * @return 
   */
  public String readSymlinkBlocking(String link) {
    def ret = this.delegate.readSymlinkBlocking(link != null ? link : null);
    return ret;
  }
  /**
   * Deletes the file represented by the specified <code>path</code>, asynchronously.
   * @param path path to the file
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem delete(String path, Handler<AsyncResult<Void>> handler) {
    this.delegate.delete(path != null ? path : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#delete}
   * @param path 
   * @return 
   */
  public FileSystem deleteBlocking(String path) {
    this.delegate.deleteBlocking(path != null ? path : null);
    return this;
  }
  /**
   * Deletes the file represented by the specified <code>path</code>, asynchronously.
   * <p>
   * If the path represents a directory and <code>recursive = true</code> then the directory and its contents will be
   * deleted recursively.
   * @param path path to the file
   * @param recursive delete recursively?
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem deleteRecursive(String path, boolean recursive, Handler<AsyncResult<Void>> handler) {
    this.delegate.deleteRecursive(path != null ? path : null, recursive != null ? recursive : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#deleteRecursive}
   * @param path 
   * @param recursive 
   * @return 
   */
  public FileSystem deleteRecursiveBlocking(String path, boolean recursive) {
    this.delegate.deleteRecursiveBlocking(path != null ? path : null, recursive != null ? recursive : null);
    return this;
  }
  /**
   * Create the directory represented by <code>path</code>, asynchronously.
   * <p>
   * The operation will fail if the directory already exists.
   * @param path path to the file
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem mkdir(String path, Handler<AsyncResult<Void>> handler) {
    this.delegate.mkdir(path != null ? path : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#mkdir}
   * @param path 
   * @return 
   */
  public FileSystem mkdirBlocking(String path) {
    this.delegate.mkdirBlocking(path != null ? path : null);
    return this;
  }
  /**
   * Create the directory represented by <code>path</code>, asynchronously.
   * <p>
   * The new directory will be created with permissions as specified by <code>perms</code>.
   * <p>
   * The permission String takes the form rwxr-x--- as specified
   * in <a href="http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html">here</a>.
   * <p>
   * The operation will fail if the directory already exists.
   * @param path path to the file
   * @param perms the permissions string
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem mkdir(String path, String perms, Handler<AsyncResult<Void>> handler) {
    this.delegate.mkdir(path != null ? path : null, perms != null ? perms : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#mkdir}
   * @param path 
   * @param perms 
   * @return 
   */
  public FileSystem mkdirBlocking(String path, String perms) {
    this.delegate.mkdirBlocking(path != null ? path : null, perms != null ? perms : null);
    return this;
  }
  /**
   * Create the directory represented by <code>path</code> and any non existent parents, asynchronously.
   * <p>
   * The operation will fail if the directory already exists.
   * @param path path to the file
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem mkdirs(String path, Handler<AsyncResult<Void>> handler) {
    this.delegate.mkdirs(path != null ? path : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#mkdirs}
   * @param path 
   * @return 
   */
  public FileSystem mkdirsBlocking(String path) {
    this.delegate.mkdirsBlocking(path != null ? path : null);
    return this;
  }
  /**
   * Create the directory represented by <code>path</code> and any non existent parents, asynchronously.
   * <p>
   * The new directory will be created with permissions as specified by <code>perms</code>.
   * <p>
   * The permission String takes the form rwxr-x--- as specified
   * in <a href="http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html">here</a>.
   * <p>
   * The operation will fail if the directory already exists.<p>
   * @param path path to the file
   * @param perms the permissions string
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem mkdirs(String path, String perms, Handler<AsyncResult<Void>> handler) {
    this.delegate.mkdirs(path != null ? path : null, perms != null ? perms : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#mkdirs}
   * @param path 
   * @param perms 
   * @return 
   */
  public FileSystem mkdirsBlocking(String path, String perms) {
    this.delegate.mkdirsBlocking(path != null ? path : null, perms != null ? perms : null);
    return this;
  }
  /**
   * Read the contents of the directory specified by <code>path</code>, asynchronously.
   * <p>
   * The result is an array of String representing the paths of the files inside the directory.
   * @param path path to the file
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem readDir(String path, Handler<AsyncResult<List<String>>> handler) {
    this.delegate.readDir(path != null ? path : null, handler != null ? new Handler<AsyncResult<java.util.List<java.lang.String>>>(){
    public void handle(AsyncResult<java.util.List<java.lang.String>> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#readDir}
   * @param path 
   * @return 
   */
  public List<String> readDirBlocking(String path) {
    def ret = this.delegate.readDirBlocking(path != null ? path : null);
    return ret;
  }
  /**
   * Read the contents of the directory specified by <code>path</code>, asynchronously.
   * <p>
   * The parameter <code>filter</code> is a regular expression. If <code>filter</code> is specified then only the paths that
   * match  @{filter}will be returned.
   * <p>
   * The result is an array of String representing the paths of the files inside the directory.
   * @param path path to the directory
   * @param filter the filter expression
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem readDir(String path, String filter, Handler<AsyncResult<List<String>>> handler) {
    this.delegate.readDir(path != null ? path : null, filter != null ? filter : null, handler != null ? new Handler<AsyncResult<java.util.List<java.lang.String>>>(){
    public void handle(AsyncResult<java.util.List<java.lang.String>> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#readDir}
   * @param path 
   * @param filter 
   * @return 
   */
  public List<String> readDirBlocking(String path, String filter) {
    def ret = this.delegate.readDirBlocking(path != null ? path : null, filter != null ? filter : null);
    return ret;
  }
  /**
   * Reads the entire file as represented by the path <code>path</code> as a , asynchronously.
   * <p>
   * Do not user this method to read very large files or you risk running out of available RAM.
   * @param path path to the file
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem readFile(String path, Handler<AsyncResult<Buffer>> handler) {
    this.delegate.readFile(path != null ? path : null, handler != null ? new Handler<AsyncResult<io.vertx.core.buffer.Buffer>>(){
    public void handle(AsyncResult<io.vertx.core.buffer.Buffer> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#readFile}
   * @param path 
   * @return 
   */
  public Buffer readFileBlocking(String path) {
    def ret= InternalHelper.safeCreate(this.delegate.readFileBlocking(path != null ? path : null), io.vertx.groovy.core.buffer.Buffer.class);
    return ret;
  }
  /**
   * Creates the file, and writes the specified <code>Buffer data</code> to the file represented by the path <code>path</code>,
   * asynchronously.
   * @param path path to the file
   * @param data 
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem writeFile(String path, Buffer data, Handler<AsyncResult<Void>> handler) {
    this.delegate.writeFile(path != null ? path : null, data != null ? (io.vertx.core.buffer.Buffer)data.getDelegate() : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#writeFile}
   * @param path 
   * @param data 
   * @return 
   */
  public FileSystem writeFileBlocking(String path, Buffer data) {
    this.delegate.writeFileBlocking(path != null ? path : null, data != null ? (io.vertx.core.buffer.Buffer)data.getDelegate() : null);
    return this;
  }
  /**
   * Open the file represented by <code>path</code>, asynchronously.
   * <p>
   * The file is opened for both reading and writing. If the file does not already exist it will be created.
   * @param path path to the file
   * @param options options describing how the file should be opened (see <a href="../../../../../../../cheatsheet/OpenOptions.html">OpenOptions</a>)
   * @param handler 
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem open(String path, Map<String, Object> options, Handler<AsyncResult<AsyncFile>> handler) {
    this.delegate.open(path != null ? path : null, options != null ? new io.vertx.core.file.OpenOptions(new io.vertx.core.json.JsonObject(options)) : null, handler != null ? new Handler<AsyncResult<io.vertx.core.file.AsyncFile>>(){
    public void handle(AsyncResult<io.vertx.core.file.AsyncFile> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#open}
   * @param path 
   * @param options  (see <a href="../../../../../../../cheatsheet/OpenOptions.html">OpenOptions</a>)
   * @return 
   */
  public AsyncFile openBlocking(String path, Map<String, Object> options) {
    def ret= InternalHelper.safeCreate(this.delegate.openBlocking(path != null ? path : null, options != null ? new io.vertx.core.file.OpenOptions(new io.vertx.core.json.JsonObject(options)) : null), io.vertx.groovy.core.file.AsyncFile.class);
    return ret;
  }
  /**
   * Creates an empty file with the specified <code>path</code>, asynchronously.
   * @param path path to the file
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem createFile(String path, Handler<AsyncResult<Void>> handler) {
    this.delegate.createFile(path != null ? path : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#createFile}
   * @param path 
   * @return 
   */
  public FileSystem createFileBlocking(String path) {
    this.delegate.createFileBlocking(path != null ? path : null);
    return this;
  }
  /**
   * Creates an empty file with the specified <code>path</code> and permissions <code>perms</code>, asynchronously.
   * @param path path to the file
   * @param perms the permissions string
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem createFile(String path, String perms, Handler<AsyncResult<Void>> handler) {
    this.delegate.createFile(path != null ? path : null, perms != null ? perms : null, handler != null ? new Handler<AsyncResult<java.lang.Void>>(){
    public void handle(AsyncResult<java.lang.Void> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#createFile}
   * @param path 
   * @param perms 
   * @return 
   */
  public FileSystem createFileBlocking(String path, String perms) {
    this.delegate.createFileBlocking(path != null ? path : null, perms != null ? perms : null);
    return this;
  }
  /**
   * Determines whether the file as specified by the path <code>path</code> exists, asynchronously.
   * @param path path to the file
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem exists(String path, Handler<AsyncResult<Boolean>> handler) {
    this.delegate.exists(path != null ? path : null, handler != null ? new Handler<AsyncResult<java.lang.Boolean>>(){
    public void handle(AsyncResult<java.lang.Boolean> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#exists}
   * @param path 
   * @return 
   */
  public boolean existsBlocking(String path) {
    def ret = this.delegate.existsBlocking(path != null ? path : null);
    return ret;
  }
  /**
   * Returns properties of the file-system being used by the specified <code>path</code>, asynchronously.
   * @param path path to anywhere on the filesystem
   * @param handler the handler that will be called on completion
   * @return a reference to this, so the API can be used fluently
   */
  public FileSystem fsProps(String path, Handler<AsyncResult<FileSystemProps>> handler) {
    this.delegate.fsProps(path != null ? path : null, handler != null ? new Handler<AsyncResult<io.vertx.core.file.FileSystemProps>>(){
    public void handle(AsyncResult<io.vertx.core.file.FileSystemProps> ar) {
      handler.handle(null);
    }
  }
 : null);
    return this;
  }
  /**
   * Blocking version of {@link io.vertx.groovy.core.file.FileSystem#fsProps}
   * @param path 
   * @return 
   */
  public FileSystemProps fsPropsBlocking(String path) {
    def ret= InternalHelper.safeCreate(this.delegate.fsPropsBlocking(path != null ? path : null), io.vertx.groovy.core.file.FileSystemProps.class);
    return ret;
  }
}
