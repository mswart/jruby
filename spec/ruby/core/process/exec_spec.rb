require File.expand_path('../../../spec_helper', __FILE__)
require File.expand_path('../../../shared/process/exec', __FILE__)

describe "Process.exec" do
  it_behaves_like :process_exec, :exec, Process
end
