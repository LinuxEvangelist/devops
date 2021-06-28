terraform {
  required_version = "1.0.1"
  required_providers {
    kubernetes = {
      source  = "hashicorp/kubernetes"
      version = "1.13.3"
    }
  }  
  backend "remote" {
    organization = "icarusperu"
    workspaces {
      name = "iac_kubernetes_app"
    }
  }
}
